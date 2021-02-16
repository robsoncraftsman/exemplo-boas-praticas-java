package com.exemplo.praticas.ruins.nomenclaturas;

public class Circulo {

	/*
	 * Nome do atributo deve ser claro.
	 */
	private final Double r;

	/*
	 * Nome do parâmetro do construtor deve ser claro.
	 */
	public Circulo(final Double r) {
		this.r = r;
	}

	/*
	 * Nome do método deve representar o objetivo do método.
	 * O valor do PI deve ser uma constante.
	 */
	public double r() {
		return 3.14 * this.r * this.r;
	}

}
