package com.exemplo.praticas.boas.acoplamento;

import java.util.ArrayList;
import java.util.List;

/*
 * Componente responsável por armazenar os dados de Pedidos em memória.
 *
 * Implementa a interface PedidoRepository.
 */
public class PedidoMemoryRepository implements PedidoRepository {

	private final List<Pedido> pedidos = new ArrayList<>();

	@Override
	public void salvar(final Pedido pedido) {
		this.pedidos.add(pedido);
	}

}