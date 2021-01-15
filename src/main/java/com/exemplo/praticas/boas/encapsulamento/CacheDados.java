package com.exemplo.praticas.boas.encapsulamento;

import java.util.Map;

/*
 * Neste caso o componente de cache possui um bom encapsulamento.
 * Os dados internos do cache não podem ser acessados diretamente.
 * Para isso, existe um método para pegar um dado específico.
 */
public class CacheDados {

	private Map<String, Object> cache;

	public CacheDados(final DadosRepository dadosRepository) {
		this.cache = dadosRepository.carregaDados();
	}

	public Object getValue(final String key) {
		return this.cache.get(key);
	}

}