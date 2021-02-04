package com.exemplo.praticas.ruins.erros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileUtil {

	private FileUtil() {

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
