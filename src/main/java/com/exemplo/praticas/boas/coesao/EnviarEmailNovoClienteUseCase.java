package com.exemplo.praticas.boas.coesao;

/*
 * Componente para enviar e-mail quando um novo cliente for cadastrado.
 */
public class EnviarEmailNovoClienteUseCase {

	public void executa(final Cliente cliente) {
		final var msg = String.format("Olá '%s'. É ótimo tê-lo como nosso cliente.", cliente.getNome());
		System.out.println(String.format("Enviando e-mail para '%s' com texto '%s'", cliente.getEmail(), msg));
	}

}
