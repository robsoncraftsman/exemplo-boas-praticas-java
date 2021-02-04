package com.exemplo.praticas.ruins.metodos;

public class PedidoService {

	/*
	 * Várias condições aninhadas.
	 * Muitos parâmetros.
	 * Possui flags como parâmetros.
	 * Realiza mais de uma ação: determina qual o desconto e aplica o desconto ao valor. 
	 * Executa as validações no meio do código
	 */
	public Double calcularDesconto(final Double valor, final Integer quantidade, final Integer estoque, final boolean descontoPorEstoque, final boolean descontoPorQuantidade) {
		Double desconto = 0D;
		if (descontoPorQuantidade) {
			if (quantidade <= 0) {
				throw new ValidationException("A quantidade deve ser maior que zero");
			}
			if (quantidade >= 100) {
				desconto = 20D;
			} else if (quantidade >= 50) {
				desconto = 10D;
			} else if (quantidade >= 10) {
				desconto = 5D;
			}
		}

		if (descontoPorEstoque) {
			if (estoque <= 0) {
				throw new ValidationException("O estoque deve ser maior que zero");
			}

			if (estoque > 1000) {
				desconto = +5D;
			}
		}

		if (valor <= 0) {
			throw new ValidationException("O valor do produto deve ser maior que zero");
		}

		return valor * (1 + (desconto / 100));
	}

}