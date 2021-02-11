package com.exemplo.praticas.ruins.dependencia;

import java.util.ArrayList;
import java.util.List;

/*
 * Repositório que grava os pedidos em memória.
 */
public class PedidoRepository {

	private List<Pedido> pedidos = new ArrayList<>();

	public void salvar(final Pedido pedido) {
		this.pedidos.add(pedido);
	}

}
