package com.exemplo.praticas.boas.metodos;

/*
 * Cada método tem uma única responsabilidade.
 * Poucas condições aninhadas.
 * Método pequenos.
 * Poucos parâmetros.
 * Sem flags como parâmetros.
 */
public class PedidoService {

	private Double calculaDescontoPorQuantidade(final Integer quantidade) {
		if (quantidade <= 0) {
			throw new ValidationException("Quantidade deve ser maior que zero");
		}

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

	private Double calculaDescontoPorEstoque(final Integer estoque) {
		if (estoque <= 0) {
			throw new ValidationException("Estoque deve ser maior que zero");
		}

		if (estoque > 1000) {
			return +5D;
		} else {
			return 0D;
		}
	}

	private Double calculaDescontoSobreValor(final Double valor, final Double desconto) {
		if (valor <= 0) {
			throw new ValidationException("Valor do produto deve ser maior que zero");
		}
		if (desconto < 0) {
			throw new ValidationException("Desconto deve maior ou igual a zero");
		}

		return valor * (1 + (desconto / 100));
	}

	public Double calcularDesconto(final Double valor, final Integer quantidade, final Integer estoque) {
		Double desconto = calculaDescontoPorQuantidade(quantidade);
		desconto = desconto + calculaDescontoPorEstoque(estoque);

		return calculaDescontoSobreValor(valor, desconto);
	}

}
