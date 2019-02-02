package com.jmk.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.jmk.springboot.model.Customer;
import com.jmk.springboot.model.MessageStorage;
import com.jmk.springboot.model.User;
import com.jmk.springboot.producer.JmsProducer;
import com.jmk.springboot.service.UserService;
import com.jmk.springboot.util.CustomErrorType;


@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	UserService userService; //Service which will do all data retrieval/manipulation work
	
	@Autowired
	JmsProducer jmsProducer;
	
	@Autowired
	MessageStorage customersStorage;
	

	// -------------------Retrieve All Users---------------------------------------------
	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users = userService.findAllUsers();
		if (users.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		
		
		
		
		//data preparing for send to JMS
		int i = 0;
		for(User user : users){
			
			// data 
			//for(int a=1;a<=10000; a++) {
			Customer customer = new Customer();
			customer.setAge(user.getAge());
			customer.setFirstname(user.getName());
			customer.setLastname("Salary: "+user.getSalary());
			customer.setId(user.getId());
			
			jmsProducer.send(customer);			
			//}
			i++;
		}		
		
		
		
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	
	// -------------------Retrieve Single User------------------------------------------
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable("id") long id) {
		logger.info("Fetching User with id {}", id);
		User user = userService.findById(id);
		if (user == null) {
			logger.error("User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("User with id " + id 
					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	
	// -------------------Create a User-------------------------------------------
	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
		logger.info("Creating User : {}", user);

		if (userService.isUserExist(user)) {
			logger.error("Unable to create. A User with name {} already exist", user.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getName() + " already exist."),HttpStatus.CONFLICT);
		}
		userService.saveUser(user);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	
	// ------------------- Update a User ------------------------------------------------
	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@PathVariable("id") long id, @RequestBody User user) {
		logger.info("Updating User with id {}", id);

		User currentUser = userService.findById(id);

		if (currentUser == null) {
			logger.error("Unable to update. User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to upate. User with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}

		currentUser.setName(user.getName());
		currentUser.setAge(user.getAge());
		currentUser.setSalary(user.getSalary());

		userService.updateUser(currentUser);
		return new ResponseEntity<User>(currentUser, HttpStatus.OK);
	}

	
	// ------------------- Delete a User-----------------------------------------
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting User with id {}", id);

		User user = userService.findById(id);
		if (user == null) {
			logger.error("Unable to delete. User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to delete. User with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}
		userService.deleteUserById(id);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

	
	// ------------------- Delete All Users-----------------------------
	@RequestMapping(value = "/user/", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteAllUsers() {
		logger.info("Deleting All Users");
		
		// deleting all customers
		customersStorage.clear();

		userService.deleteAllUsers();
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	
	// -------------------Retrieve All JMS Message Received List from MessageStorage---------------------------------------------
		@RequestMapping(value = "/jmsMsgs/", method = RequestMethod.GET)
		public ResponseEntity<List<Customer>> listAllJMSreceivedMSGs() {
			
			List<Customer> customers = (List<Customer>) customersStorage.getAll();
			
			if (customers.isEmpty()) {
				return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
				// You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
		}
		
		// ----------------------------- Downstream Call--------------
		@RequestMapping(value = "/dcall/", method = RequestMethod.GET)
		public ResponseEntity<List<Customer>> DCall() {
			
			userService.DownStreamCallWay2();
			
			List<Customer> customers = (List<Customer>) customersStorage.getAll();
			
			if (customers.isEmpty()) {
				return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
				// You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
		}


}