package com.exemplo.praticas.ruins.encapsulamento;

import java.util.HashMap;
import java.util.Map;

/*
 * Neste caso o cache de dados não possui qualquer encapsulamento.
 *
 * Os dados do cache estão totalmente expostos a outros componentes.
 *
 * Inclusive permitindo que estes mudem os dados do cache,
 * mudando diretamente seu estado interno.
 */
public class CacheDados {

	private Map<String, Object> cache = new HashMap<>();

	public Map<String, Object> getCache() {
		return this.cache;
	}

	public void setCache(final Map<String, Object> cache) {
		this.cache = cache;
	}

}
