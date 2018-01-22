package com.userRegistration.demo.exception;

public class UserException extends Exception {

	private static final long serialVersionUID = -457531723818045056L;

	public UserException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserException(String message) {
		super(message);
	}
}
