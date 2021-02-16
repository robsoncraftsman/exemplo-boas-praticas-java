package com.exemplo.praticas.boas.coesao;

/*
 * Neste exemplo, cada etapa do processo de cadastrar um novo cliente foi delegado
 * para um componente específico, desta forma mantendo a alta coesão de cada componente.
 */
public class ClienteService {

	private final ClienteValidator clienteValidor = new ClienteValidator();
	private final ClienteRepository clienteRepository = new ClienteRepository();
	private final EmailClienteService emailClienteService = new EmailClienteService();

	public void salvar(final Cliente cliente) {
		this.clienteValidor.validarCamposObrigatorios(cliente);
		this.clienteValidor.validarIdadeCliente(cliente);
		this.clienteRepository.salvar(cliente);
		this.emailClienteService.enviar(cliente);
	}

}
