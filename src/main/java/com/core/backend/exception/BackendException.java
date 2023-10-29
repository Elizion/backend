package com.core.backend.exception;


public class BackendException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BackendException(String message, Throwable cause){
        super(message, cause);
    }

	public BackendException(String message) {
		super(message);
	}
	
}
