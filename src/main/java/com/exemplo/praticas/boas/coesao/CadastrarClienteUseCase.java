package com.exemplo.praticas.boas.coesao;

/*
 * Implementação de um caso de uso que tem como objetivo cadastrar um cliente.
 *
 * Neste exemplo, cada etapa do processo de cadastrar um novo cliente foi delegado
 * para um componente específico, desta forma mantendo a alta coesão de cada componente.
 */
public class CadastrarClienteUseCase {

	private ValidacaoCamposObrigatoriosCadastroCliente validacaoCamposObrigatoriosCadastroCliente = new ValidacaoCamposObrigatoriosCadastroCliente();
	private ClienteRepository clienteRepository = new ClienteRepository();
	private EnviarEmailNovoClienteUseCase enviarEmailNovoClienteUseCase = new EnviarEmailNovoClienteUseCase();

	public void executa(final Cliente cliente) {
		this.validacaoCamposObrigatoriosCadastroCliente.validar(cliente);
		this.clienteRepository.salvar(cliente);
		this.enviarEmailNovoClienteUseCase.executa(cliente);
	}

}
