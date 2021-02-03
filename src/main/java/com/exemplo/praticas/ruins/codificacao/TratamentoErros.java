package com.exemplo.praticas.ruins.codificacao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TratamentoErros {

	/*
	 * Método dispara uma exceção checked
	 * Método dispara uma exceção genérica
	 */
	public void validarPreco(final Double valor) throws Exception {
		if (valor < 0) {
			throw new Exception("Valor deve ser maior que zero");
		}
	}

	/*
	 * Método retorna um array de bytes vazio em caso de exceção.
	 * Exceções são ignoradas.
	 * Usuário não recebe qualquer feedback em caso de erro.
	 * É feita uma captura genérica para qualquer Exception
	 */
	public byte[] loadFile(final String fileName) throws FileNotFoundException {
		final File fileToRead = new File(fileName);
		final InputStream fileStream = new FileInputStream(fileToRead);
		try {
			try (fileStream) {
				final byte[] fileContent = fileStream.readAllBytes();
				return fileContent;
			}
		} catch (final Exception e) {
			return new byte[0];
		}
	}
}
