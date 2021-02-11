package com.exemplo.praticas.boas.dependencia;

/*
 * Neste caso o componente PedidoService não tem mais controle sobre o ciclo de vida do
 * componente PedidoRepository. Aqui ele é passado como parâmetro no seu construtor,
 * mas ele pode ser atribuído via método "setPedidoRepository" ou utilizado um
 * container de injeção de dependências como o Spring ou CDI do JEE com uma anotação
 * para o container faça esta injeção de forma automática.
 */
public class PedidoService {

	private final PedidoRepository pedidoRepository;

	public PedidoService(final PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	public void salvar(final Pedido pedido) {
		this.pedidoRepository.salvar(pedido);
	}

}
