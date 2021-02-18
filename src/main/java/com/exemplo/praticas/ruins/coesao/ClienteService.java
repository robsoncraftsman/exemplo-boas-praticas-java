package com.exemplo.praticas.ruins.coesao;

/*
 * Neste exemplo o componente ClienteService apresenta baixa coesão.
 *
 * Ele tem várias responsabilidades, como:
 * - Validar dados
 * - Salvar dados
 * - Enviar e-mail
 */
public class ClienteService {

	public void salvar(final Cliente cliente) {
		validarDadosCliente(cliente);
		salvarNoBanco(cliente);
		enviarEmail(cliente);
	}

	private void validarDadosCliente(final Cliente cliente) {
		if ((cliente.getNome() == null) || "".equals(cliente.getNome())) {
			throw new IllegalArgumentException("Nome deve ser preenchido");
		}

		if (cliente.getIdade() < 18) {
			throw new IllegalArgumentException("Cliente deve ter mais que 18 anos");
		}
	}

	private void salvarNoBanco(final Cliente cliente) {
		System.out.println(String.format("Cliente %s salvo com sucesso.", cliente.getId()));
	}

	private void enviarEmail(final Cliente cliente) {
		final var msg = String.format("Olá '%s'. É ótimo tê-lo como nosso cliente.", cliente.getNome());
		System.out.println(String.format("Enviando e-mail para '%s' com texto '%s'", cliente.getEmail(), msg));
	}

}
