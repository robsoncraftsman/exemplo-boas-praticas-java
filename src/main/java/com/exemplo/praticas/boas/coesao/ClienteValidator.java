package com.exemplo.praticas.boas.coesao;

public class ClienteValidator {

	private static final Integer IDADE_MINIMA_CLIENTE = 18;

	public void validarCamposObrigatorios(final Cliente cliente) {
		if ((cliente.getNome() == null) || "".equals(cliente.getNome())) {
			throw new ValidationException("Nome deve ser preenchido");
		}
	}

	public void validarIdadeCliente(final Cliente cliente) {
		if (cliente.getIdade() < ClienteValidator.IDADE_MINIMA_CLIENTE) {
			throw new ValidationException(String.format("Idade do cliente deve ser maior ou igual a %s", ClienteValidator.IDADE_MINIMA_CLIENTE));
		}
	}

}
