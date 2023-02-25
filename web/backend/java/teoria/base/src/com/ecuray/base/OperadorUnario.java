package com.ecuray.base;

/**
 * @author Estalyn
 *
 */
public class OperadorUnario {
	/*
	 * Operadores unarios =>
	 * += (resultado = resulta + X)
	 * ++ (resultado = resulta + 1)
	 * -= (resultado = resulta - X)
	 * -- (resultado = resulta - 1)
	 * *= (resultado = resulta * X)
	 * /= (resultado = resulta / X)
	 * %= (resultado = resulta % X)
	 * 
	 * */
	public static void main(String[] args) {
		int resultado = 0; 
		System.out.print("Operador Unitario suma => ");
		resultado += 5; 
		System.out.println("resultado = resultado + 5: " + resultado);
				
		System.out.print("Operador Unitario suma => ");
		resultado++; 
		System.out.println("resultado = resultado + 1: " + resultado);

		System.out.print("Operador Unitario resta => ");
		--resultado; 
		System.out.println("resultado = resultado - 1: " + resultado);
		
		System.out.print("Orden del operador (posterior a ser evaluado) ");
		System.out.println("resultado = resultado - 1: " + resultado--);
		System.out.println("Valor del resultado actual: " + resultado);
		
		System.out.print("Orden del operador (antes a ser evaluado) ");
		System.out.println("resultado = resultado - 1: " + --resultado);
	}

}
