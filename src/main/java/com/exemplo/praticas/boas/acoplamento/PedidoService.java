package com.exemplo.praticas.boas.acoplamento;

/*
 * Neste caso o componente PedidoService possui um acoplamento fraco com
 * o componente PedidoRepository pois este componente é apenas uma
 * interface e não uma implementação concreta.
 *
 * Além disso, ele recebe a interface como parâmetro no seu construtor,
 * permitindo assim a inversão de controle e a injeção de dependências e
 * facilitando em muito a escrita de testes para este componente.
 */
public class PedidoService {

	private PedidoRepository pedidoRepository;

	public PedidoService(final PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	public void salvar(final Pedido pedido) {
		this.pedidoRepository.salvar(pedido);
	}

}
