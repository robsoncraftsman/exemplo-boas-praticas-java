package com.exemplo.praticas.boas.erros;

public class ArquivoNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ArquivoNaoEncontradoException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

}