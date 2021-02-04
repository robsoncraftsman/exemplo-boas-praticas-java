package com.exemplo.praticas.boas.nomenclatura;

public class CirculoUtil {

	private CirculoUtil() {

	}

	/*
	 * Foi criada uma constante para o PI
	 */
	public static final double PI = 3.14;

	/*
	 * Nome do método e do parâmetro são claros
	 */
	public static double calcularAreaCirculo(final double raio) {
		return CirculoUtil.PI * raio * raio;
	}

}
