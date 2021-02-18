package com.exemplo.praticas.boas.coesao;

public class ClienteRepository {

	public void inserir(final Cliente cliente) {
		System.out.println(String.format("Cliente %s inserido com sucesso.", cliente.getId()));
	}

}
