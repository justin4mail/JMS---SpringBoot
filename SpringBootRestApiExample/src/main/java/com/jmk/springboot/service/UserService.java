package com.jmk.springboot.service;


import java.util.List;

import com.jmk.springboot.model.Customer;
import com.jmk.springboot.model.User;

public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers();
	
	void deleteAllUsers();
	
	boolean isUserExist(User user);

	boolean DownStreamCall();
	boolean DownStreamCallWay2();

}
