package com.exemplo.praticas.ruins.coesao;

/*
 * Objeto de domínio que representa a entidade Cliente.
 */
public class Cliente {

	private Long id;
	private String nome;
	private String email;
	private String logradouro;
	private String cep;
	private String numero;
	private String cidade;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

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

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(final String cidade) {
		this.cidade = cidade;
	}

}
