package com.exemplo.praticas.boas.erros;

public class PedidoService {

	/*
	 * Método dispara uma exceção unchecked (RuntimeException).
	 * Método dispara uma exceção específica para validação.
	 */
	public void validarPreco(final Double valor) {
		if (valor < 0) {
			throw new ValidationException("Valor deve ser maior que zero");
		}
	}

}
