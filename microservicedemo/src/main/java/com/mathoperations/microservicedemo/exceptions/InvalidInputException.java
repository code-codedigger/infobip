package com.mathoperations.microservicedemo.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5124095364408714021L;

	public InvalidInputException(String exception) {
		super(exception);
	}
}
