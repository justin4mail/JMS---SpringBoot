package com.jmk.springboot.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.comcast.schemafiles.StandardizeAddressError.response.StandardizeAddressError;
import com.comcast.schemafiles.StandardizeAddressError.response.StandardizeAddressErrors;
import com.comcast.schemafiles.StandardizeAddressInfo.response.StandardizeAddressInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jmk.springboot.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	private static final AtomicLong counter = new AtomicLong();

	private static List<User> users;

	static {
		users = populateDummyUsers();
	}

	public List<User> findAllUsers() {
		return users;
	}

	public User findById(long id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public User findByName(String name) {
		for (User user : users) {
			if (user.getName().equalsIgnoreCase(name)) {
				return user;
			}
		}
		return null;
	}

	public void saveUser(User user) {
		user.setId(counter.incrementAndGet());
		users.add(user);
	}

	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
	}

	public void deleteUserById(long id) {

		for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
			}
		}
	}

	public boolean isUserExist(User user) {
		return findByName(user.getName()) != null;
	}

	public void deleteAllUsers() {
		users.clear();
	}

	private static List<User> populateDummyUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(), "Sam", 30, 70000));
		users.add(new User(counter.incrementAndGet(), "Tom", 40, 50000));
		users.add(new User(counter.incrementAndGet(), "Jerome", 45, 30000));
		users.add(new User(counter.incrementAndGet(), "Silvia", 50, 40000));
		return users;
	}

	public boolean DownStreamCall() {

		List<User> users = new ArrayList<User>();

		final String uri = "https://address-standardization-service-int.u1.app.cloud.comcast.net:443/api/addresses/standardize/byAddressString?address=183 inverness dr w englewood co&components=geographyInfo,telephonyInfo";

		String accessToken = "eyJhbGciOiJSUzI1NiIsImtpZCI6IkpXVFNpZ25pbmdDZXJ0LTIwMTUifQ.eyJzY29wZSI6WyJlc2w6bG9jYXRpb24iXSwiY2xpZW50X2lkIjoiYnNkLWNzcCIsImlzcyI6Imh0dHBzOi8vd2Vic2VjLWludC5jYWJsZS5jb21jYXN0LmNvbSIsImV4cCI6MTU0OTA0MjQyOX0.HPKkKQdhLRO5jwzxMxRQ-uA4NWnDqmkzaf_wKIyb2yeY4ptCl801wZmBym1yXdilyT48sW6q6B79vXjxUWPQF-L_fRiHf5-SyfUwrneXMDDFl4MSEhym68mGQhaJm1fir9ayw_hOlsM2mYnQ-MYnBHlwyDmogYKsgxgwTkIC5DrJYwvasRKK_MdlXbpynDMhYoYXd82QAJiX-SvXgEnR3_dV2W8nUtmXzMm1xAgoLz14FYUgZwHYjMlHb1ZrY2EqLB4y7TSEPsg_onxiSyxzqPJgWbr6dW96_jXyKuGeVhKochsV5WbW0kknxcG6Y1nYnOxJcK8AqAZfu1LMlyQT2g";

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer " + accessToken);

		try {
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);

			System.out.println("result: " + result);

		} catch (Exception exp) {
			String resultString = restTemplate.getForObject(exp.getMessage(), String.class);

			System.out.println("Error: " + resultString);
		}

		return true;
	}

	public boolean DownStreamCallWay2() {

		HttpURLConnection request = null;
		Gson gson = new GsonBuilder().create();

		try {
			String strURL = "https://address-standardization-service-int.u1.app.cloud.comcast.net/api/addresses/standardize/byAddressString?8209%20Pine%20Road%20philadelphia%20PA%20US%2019111&components=geographyInfo";
			// String strURL =
			// "https://address-standardization-service-int.u1.app.cloud.comcast.net/api/addresses/standardize/byAddressString?address=8209%20Pine%20Road%20philadelphia%20PA%20US%2019111&components=geographyInfo";
			String authID = "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkpXVFNpZ25pbmdDZXJ0LTIwMTUifQ.eyJzY29wZSI6WyJlc2w6bG9jYXRpb24iXSwiY2xpZW50X2lkIjoiYnNkLWNzcCIsImlzcyI6Imh0dHBzOi8vd2Vic2VjLWludC5jYWJsZS5jb21jYXN0LmNvbSIsImV4cCI6MTU0OTA4MzYxNX0.NJMuz2m_Eor6i7K7B4LpgWu2GKPURtZAQfn1pZL3cIxjrOAZ2DG1EYcU9aHZRMJi3m3Q7TMOCi1nB6hvrTdQrTQUHIHDZvBu2jrQRjTfrIQCuVhtXFv5aOdWfRcVDsTOG6E08Sdew6dHwkiUFhAxOCGNU4BpSDFS_8gydWGp5T8KhUexJOdnf1sRYt9ndIQreCb33g44NeTLgPn7-sudIWda7rgODtVud1xfMsWM3mgawbpZn0dQfi0YWB2AcpCCrkZsbb9SrUyf8cXRi1qxcYQ-1wUoISBNlaHCujJ-qmRscTDokLv-CNRHhtY6MyO-t9CjKLyhwha_RVaf9RuqCA";
			// strURL = strURL.replace(" ", "%20");
			URL url = new URL(strURL);
			request = (HttpURLConnection) url.openConnection();
			// mapping the request headers
			request = mapRequestHeaders(request, authID);
			// request.getResponseCode() to get the response code of the request
			int responseCode = request.getResponseCode();
			System.out.println("responseCode: " + responseCode);
			System.out.println("response: " + request.getResponseMessage());

			/*
			 * Response r = gson.fromJson(request.getInputStream().toString(),
			 * Response.class);
			 * 
			 * String byAddressStringELocResponse = (r.toString());
			 * System.out.println(byAddressStringELocResponse);
			 */

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
		}

		String locationserviceResponse = "";
		try {
			locationserviceResponse = org.apache.commons.io.IOUtils.toString(request.getInputStream(), "UTF-8");
		} catch (IOException e) {
			System.out.println("Error: inputstream is empty");
		}
		
		if (null != request.getErrorStream()) {
			try {
				locationserviceResponse = org.apache.commons.io.IOUtils.toString(request.getErrorStream(), "UTF-8");
	
				StandardizeAddressErrors addressErrorResp = (StandardizeAddressErrors) convertJsonToObject(locationserviceResponse, StandardizeAddressErrors.class);
				
				if (null != addressErrorResp) {
					System.out.println("Error from downstream: " + addressErrorResp.getMessage());
				}

			} catch (Exception e) {
				System.out.println("Error in errorstreaming object conversion"+e.getMessage());
			}
		} else	{
			StandardizeAddressInfo addressResponse = (StandardizeAddressInfo) convertJsonToObject(
					locationserviceResponse, StandardizeAddressInfo.class);
			// StandardizeAddressesInfo addressResponse = (StandardizeAddressesInfo) object;

			// addressResponse = addressResponse;
			try {
				System.out.println("MCD : " + addressResponse.getStandardizeAddressesInfo().get(0).getGeographyInfo()
						.getMinorCivilDivision());
			} catch (Exception exx) {
				System.out.println(exx.getMessage());
			}
		}
		return true;
	}

	private HttpURLConnection mapRequestHeaders(HttpURLConnection request, String authID) {

		try {
			request.setRequestMethod("GET");
			request.setRequestProperty("Accept", "application/json");
			// request.setRequestProperty(Constants.SOURCE_SYSTEM_ID, sourceSystemID);
			request.setReadTimeout(100000);
			request.setConnectTimeout(100000);
			request.setRequestProperty("Authorization", authID);
			// request.setDoOutput(true);
		} catch (ProtocolException e) {
			// throwing the CISApplicationException by wrapping
			// ProtocolException
		}
		return request;
	}

	@SuppressWarnings("unchecked")
	private Object convertJsonToObject(String response, Class className) {
		Object object = null;
		Gson gson = new Gson();
		try {
			object = gson.fromJson(response, className);
		} catch (Exception exe) {
			System.err.println("[Camel:LocationServiceutil] exception occured while coverting json to object" + exe);
		}
		return object;
	}

}
