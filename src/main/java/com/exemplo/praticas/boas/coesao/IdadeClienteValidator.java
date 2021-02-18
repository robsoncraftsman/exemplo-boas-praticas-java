package com.exemplo.praticas.boas.coesao;

public class IdadeClienteValidator {

	private static final Integer IDADE_MINIMA_CLIENTE = 18;

	public void validar(final Cliente cliente) {
		if (cliente.getIdade() < IdadeClienteValidator.IDADE_MINIMA_CLIENTE) {
			throw new ValidationException(String.format("Idade do cliente deve ser maior ou igual a %s", IdadeClienteValidator.IDADE_MINIMA_CLIENTE));
		}
	}

}
