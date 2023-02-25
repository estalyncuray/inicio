package com.ecuray.base;

/**
 * @author Estalyn
 *
 */
public class OperadorRelacionalYLogico {

	/*
	 * Operadores relacionales =>
	 * <> mayor que y menor que
	 * == igual
	 * != distinto
	 * <= menor igual
	 * >= mayor igual
	 * */
	
	/*
	 * Operadores lógicos =>
	 * && hace referencia  a que las dos expresiones se deben cumplir (A) y (B)
	 * || hace referencia  a que una de las expresiones se deben cumplir (A) o (B)
	 * & evalua las dos expresiones, incluso si la primera ha sido false
	 * | 
	 * ! 
	 * 
	 * */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean resultado;
		resultado = 4 > 0;
		System.out.print("Operador relacional: ");
		System.out.print(resultado);

		System.out.print("Operador lógico AND: ");
		resultado = (4 > 3) && (5 + 1) > 6;
		System.out.print(" (4 > 3) y (5 + 1) > 6 " + resultado);
		
		System.out.print("Operador lógico OR: ");
		resultado =(4 > 3) || (5 + 1) > 6;
		System.out.print(" (4 > 3) o (5 + 1) > 6 " + resultado);
	}

}
