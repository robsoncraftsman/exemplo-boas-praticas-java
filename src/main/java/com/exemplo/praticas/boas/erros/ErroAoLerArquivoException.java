package com.exemplo.praticas.boas.erros;

public class ErroAoLerArquivoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ErroAoLerArquivoException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

}