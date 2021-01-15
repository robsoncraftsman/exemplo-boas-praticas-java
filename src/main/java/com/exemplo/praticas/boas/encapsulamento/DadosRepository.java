package com.exemplo.praticas.boas.encapsulamento;

import java.util.HashMap;
import java.util.Map;

/*
 * Repositório para buscar um dado qualquer.
 */
public class DadosRepository {

	public Map<String, Object> carregaDados() {
		final var dados = new HashMap<String, Object>();
		dados.put("1", "João");
		dados.put("2", "Maria");
		dados.put("3", "José");
		return dados;
	}

}
