package com.exemplo.praticas.boas.codificacao;

public class NomesSignificativos {

	/*
	 * Foi criada uma constante para o PI
	 */
	public static final double PI = 3.14;

	/*
	 * Nome do método e do parâmetro são claros
	 */
	public double calcularAreaCirculo(final double raio) {
		return NomesSignificativos.PI * raio * raio;
	}

	/*
	 * Nome do parâmetro referente ao filtro de cliente ficou claro.
	 * Nome da parâmetro referente ao repositório ficou claro.
	 * Nome da variável referente ao cliente consultado ficou clara.
	 */
	public Cliente consultarCliente(final Cliente clienteFilter, final ClienteRepository clienteRepository) {
		final Cliente clienteConsultado = clienteRepository.consultar(clienteFilter.getId());
		return clienteConsultado;
	}

}

interface Cliente {
	Long getId();
}

interface ClienteRepository {
	Cliente consultar(final Long id);
}
