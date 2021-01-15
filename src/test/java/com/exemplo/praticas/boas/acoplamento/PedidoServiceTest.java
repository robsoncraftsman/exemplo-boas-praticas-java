package com.exemplo.praticas.boas.acoplamento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class PedidoServiceTest {

	@Test
	void deveCadastrarPedido() {
		final var mockValues = new HashMap<String, Object>();
		final PedidoRepository pedidoRepository = new PedidoRepository() {
			@Override
			public void salvar(final Pedido pedido) {
				mockValues.put("salvou", true);
				mockValues.put("pedido", pedido);
			}
		};

		final var pedido = new Pedido();
		pedido.setId(1L);

		final var pedidoService = new PedidoService(pedidoRepository);
		pedidoService.salvar(pedido);
		assertEquals(true, mockValues.get("salvou"));
		assertEquals(pedido, mockValues.get("pedido"));
	}

}
