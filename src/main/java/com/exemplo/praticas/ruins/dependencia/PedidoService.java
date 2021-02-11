package com.exemplo.praticas.ruins.dependencia;

/*
 * Neste caso o componente PedidoService é responsável por criar e gerenciar 
 * o componente PedidoRepository.
 */
public class PedidoService {

	private final PedidoRepository pedidoRepository;

	public PedidoService() {
		this.pedidoRepository = new PedidoRepository();
	}

	public void salvar(final Pedido pedido) {
		this.pedidoRepository.salvar(pedido);
	}

}
