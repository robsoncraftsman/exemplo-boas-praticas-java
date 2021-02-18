package com.exemplo.praticas.boas.coesao;

/*
 * Neste exemplo, cada etapa do processo de cadastrar um novo cliente foi delegado
 * para um componente específico, desta forma mantendo a alta coesão de cada componente.
 */
public class ClienteService {

	private final CamposObrigatoriosClienteValidator camposObrigatoriosClienteValidator = new CamposObrigatoriosClienteValidator();
	private final IdadeClienteValidator idadeClienteValidator = new IdadeClienteValidator();
	private final ClienteRepository clienteRepository = new ClienteRepository();
	private final EmailClienteRecemCadastrado emailClienteRecemCadastrado = new EmailClienteRecemCadastrado();

	public void inserir(final Cliente cliente) {
		this.camposObrigatoriosClienteValidator.validar(cliente);
		this.idadeClienteValidator.validar(cliente);
		this.clienteRepository.inserir(cliente);
		this.emailClienteRecemCadastrado.enviar(cliente);
	}

}
