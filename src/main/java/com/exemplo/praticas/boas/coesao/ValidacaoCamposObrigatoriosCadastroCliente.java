package com.exemplo.praticas.boas.coesao;

/*
 * Componente responsável por validar a validação dos campos obrigatório de um cliente durante um novo cadastro.
 */
public class ValidacaoCamposObrigatoriosCadastroCliente {

	public void validar(final Cliente cliente) {
		if ((cliente.getNome() == null) || "".equals(cliente.getNome())) {
			throw new IllegalArgumentException("Nome deve ser preenchido");
		}
	}

}
