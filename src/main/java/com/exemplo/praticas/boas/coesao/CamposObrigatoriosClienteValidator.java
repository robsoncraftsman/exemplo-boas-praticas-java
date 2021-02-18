package com.exemplo.praticas.boas.coesao;

public class CamposObrigatoriosClienteValidator {

	public void validar(final Cliente cliente) {
		if ((cliente.getNome() == null) || "".equals(cliente.getNome())) {
			throw new ValidationException("Nome deve ser preenchido");
		}
	}

}
