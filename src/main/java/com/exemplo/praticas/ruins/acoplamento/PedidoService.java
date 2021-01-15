package com.exemplo.praticas.ruins.acoplamento;

/*
 * Neste caso o componente PedidoService tem um acoplamento forte com o
 * repositório PedidoRepository.
 *
 * Tanto ele cria uma instância do mesmo diretamente no seu construtor,
 * como ele depende de uma classe concreta, já que o PedidoRepository
 * não implementa nenhuma interface.
 */
public class PedidoService {

	private PedidoRepository pedidoRepository;

	public PedidoService() {
		this.pedidoRepository = new PedidoRepository();
	}

	public void salvar(final Pedido pedido) {
		this.pedidoRepository.salvar(pedido);
	}

}
