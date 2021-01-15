package com.exemplo.praticas.boas.coesao;

/*
 * Componente para salvar dados de clientes.
 */
public class ClienteRepository {

	public void salvar(final Cliente cliente) {
		System.out.println(String.format("Cliente %s salvo com sucesso.", cliente.getId()));
	}

}
