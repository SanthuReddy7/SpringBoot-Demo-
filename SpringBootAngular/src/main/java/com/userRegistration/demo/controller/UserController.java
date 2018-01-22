package com.userRegistration.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.userRegistration.demo.business.UserBusiness;
import com.userRegistration.demo.exception.UserException;


@RestController
public class UserController {

	@Autowired
	private UserBusiness Userbusiness;
	
	@RequestMapping(path = "/add", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addUser(@RequestBody Map<String, Object> input) throws UserException 	{
		
		int bookId = Userbusiness.addUser(input);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "success");
		map.put("id", bookId);
		
		
		ResponseEntity<Map<String, Object>> resValue = new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
		return resValue;
	}
}
