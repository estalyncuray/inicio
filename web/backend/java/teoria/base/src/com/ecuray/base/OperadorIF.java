package com.ecuray.base;

/**
 * @author Estalyn
 *
 */
public class OperadorIF {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		boolean resultado;
		/*
		 * Forma clasica de expresar una comparación mediante un IF (resultado esperado) ELSE (resultado diferente)
		 * */
		if(4 > 3 ) {
			resultado = true;
		} else {
			resultado = false;
		}
		/*
		 * Forma de rápida IF (?) ELSE (:)
		 * */
		resultado = (4 > 3) ? true : false;

	}

}
