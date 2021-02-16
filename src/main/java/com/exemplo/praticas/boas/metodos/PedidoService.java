package com.exemplo.praticas.boas.metodos;

/*
 * Cada método tem uma única responsabilidade.
 * Métodos ficaram menores.
 * Apenas uma condição aninhada.
 */
public class PedidoService {

	protected Double calculaDescontoPorQuantidade(final Integer quantidade) {
		if (quantidade >= 100) {
			return 20D;
		} else if (quantidade >= 50) {
			return 10D;
		} else if (quantidade >= 10) {
			return 5D;
		} else {
			return 0D;
		}
	}

	protected Double calculaDescontoPorEstoque(final Integer estoque) {
		if (estoque > 1000) {
			return 5D;
		} else {
			return 0D;
		}
	}

	protected Double calculaDescontoSobreValor(final Double valor, final Double desconto) {
		return valor * (1 + (desconto / 100));
	}

	public Double calcularDesconto(final Double valor, final Integer quantidade, final Integer estoque, final boolean descontoPorQuantidade, final boolean descontoPorEstoque) {
		Double desconto = 0D;
		if (descontoPorQuantidade) {
			desconto = desconto + calculaDescontoPorQuantidade(quantidade);
		}
		if (descontoPorEstoque) {
			desconto = desconto + calculaDescontoPorEstoque(estoque);
		}

		return calculaDescontoSobreValor(valor, desconto);
	}

}
