package com.userRegistration.demo.business;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.userRegistration.demo.exception.UserException;


@Component
public class UserBusiness {

	public int addUser(Map<String, Object> user) throws UserException	{
		
		return 1;
	}
}
