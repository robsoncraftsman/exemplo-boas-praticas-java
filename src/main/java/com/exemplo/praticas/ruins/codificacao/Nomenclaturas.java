package com.exemplo.praticas.ruins.codificacao;

public class Nomenclaturas {

	/*
	 * Nome do método deve representar o objetivo do método.
	 * Nomes dos parâmetros e variáveis devem ser claros.
	 * O valor do PI deve ser uma constante.
	 */
	public double r(final double r) {
		return 3.14 * r * r;
	}

	/*
	 * Nome do parâmetro repositório deve ser mais específico.
	 * Nome do parâmetro e da variável de retorno são semelhantes, podendo gerar confusão.
	 */
	public Cliente consultarCliente(final Cliente cliente, final ClienteRepository repository) {
		final Cliente cliente2 = repository.consultar(cliente.getId());
		return cliente2;
	}

}

interface Cliente {
	Long getId();
}

interface ClienteRepository {
	Cliente consultar(final Long id);
}
