package com.exemplo.praticas.ruins.nomenclatura;

public class ClienteService {

	/*
	 * TODO: Nome do atributo repository deve ser melhor descrito.
	 */
	private final ClienteRepository repository;

	/*
	 * TODO: Nome do parâmetro repository deve ser melhor descrito.
	 */
	public ClienteService(final ClienteRepository repository) {
		this.repository = repository;
	}

	/*
	 * TODO: Nome do parâmetro e da variável de retorno são semelhantes, podendo gerar confusão.
	 */
	public Cliente findCliente(final Cliente cliente) {
		final Cliente cliente2 = this.repository.consultar(cliente.getId());
		return cliente2;
	}

}
