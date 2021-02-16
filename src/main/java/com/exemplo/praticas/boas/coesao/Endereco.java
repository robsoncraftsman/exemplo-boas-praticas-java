package com.exemplo.praticas.boas.coesao;

public class Endereco {

	private String logradouro;
	private String cep;
	private String numero;
	private Cidade cidade;

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(final String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(final String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(final String numero) {
		this.numero = numero;
	}

	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(final Cidade cidade) {
		this.cidade = cidade;
	}

}
