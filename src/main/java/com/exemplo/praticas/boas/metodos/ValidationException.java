package com.exemplo.praticas.boas.metodos;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValidationException(final String msg) {
		super(msg);
	}

}
