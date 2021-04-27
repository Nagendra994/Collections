package com.createiq.exhandling;

public class invalidAgeException extends RuntimeException {
	public invalidAgeException() {
		super();
	}

	public invalidAgeException(String message) {
		super(message);
	}
}
