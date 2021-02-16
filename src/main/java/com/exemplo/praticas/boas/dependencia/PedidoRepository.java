package com.exemplo.praticas.boas.dependencia;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {

	private final List<Pedido> pedidos = new ArrayList<>();

	public void salvar(final Pedido pedido) {
		this.pedidos.add(pedido);
	}

}
