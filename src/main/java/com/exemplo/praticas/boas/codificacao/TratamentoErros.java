package com.exemplo.praticas.boas.codificacao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TratamentoErros {

	/*
	 * Método dispara uma exceção unchecked.
	 * Método dispara uma exceção específica para validação.
	 */
	public void validarPreco(final Double valor) {
		if (valor < 0) {
			throw new ValidationException("Valor deve ser maior que zero");
		}
	}

	/*
	 * Método retorna uma exceção unchecked.
	 * Método dispara uma exceção específica em caso de erro.
	 * Nenhuma exceção é ignorada.
	 * Exceções são tratadas em pontos específicos e não de forma genérica.
	 */
	public byte[] loadFile(final String fileName) {
		final File fileToRead = new File(fileName);
		try {
			final InputStream fileStream = new FileInputStream(fileToRead);
			try (fileStream) {
				return fileStream.readAllBytes();
			} catch (final IOException e) {
				throw new ErroAoLerArquivoException(fileName, e);
			}
		} catch (final FileNotFoundException e) {
			throw new ArquivoNaoEncontradoException(fileName, e);
		}
	}
}

class ValidationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ValidationException(final String msg) {
		super(msg);
	}
}

class ArquivoNaoEncontradoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ArquivoNaoEncontradoException(final String msg, final Throwable cause) {
		super(msg, cause);
	}
}

class ErroAoLerArquivoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ErroAoLerArquivoException(final String msg, final Throwable cause) {
		super(msg, cause);
	}
}
