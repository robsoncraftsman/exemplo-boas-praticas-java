package com.exemplo.praticas.boas.erros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {

	private FileUtil() {

	}

	/*
	 * Método retorna uma exceção unchecked (RuntimeExcpetion).
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
