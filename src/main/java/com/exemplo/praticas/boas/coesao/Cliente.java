package com.exemplo.praticas.boas.coesao;

public class Cliente {

	private Long id;
	private String nome;
	private String email;
	private Endereco endereco;
	private Integer idade;

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

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(final Endereco endereco) {
		this.endereco = endereco;
	}

	public Integer getIdade() {
		return this.idade;
	}

	public void setIdade(final Integer idade) {
		this.idade = idade;
	}

}
