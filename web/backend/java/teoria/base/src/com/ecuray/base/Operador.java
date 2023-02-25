package com.ecuray.base;

/**
 * @author Estalyn
 *
 */
public class Operador {

	/*
	 * Operadores => 
	 * + suma para valores númericos
	 * + concatenación para carácteres
	 * - resta
	 * <*> módulo o resto
	 * </> división
	 * */
	
	/*
	 * - Resultado entero (eResultado) => 4 + 3 = 7
	 * 
	 * - Resultado decimal (dResultado) => 8 / 5 = 1.0 (error) esto se debe a que 
	 * el primero se realiza el cálculo con los valores enteros y luego la asignación a double
	 * 
	 * - Resultado decimal cast (dCResultado) => (doouble) 8/8 = 1.6 (ok) al realiza el cast, se hace
	 * referencia a que los valores enteros ahora los interprete como (double)
	 * */
	
	public static void main(String[] args) {
		int eResultado; 
		eResultado = 4 + 3; 
		System.out.print("Resultado entero: ");
		System.out.println(eResultado);
		
		double dResultado; 
		dResultado = 8 / 5;
		System.out.print("Resultado decimal incorrecto: ");
		System.out.println(dResultado);
		
		double dCResultado; 
		dCResultado = (double) 8 / 5;
		System.out.print("Resultado decimal (cast) correcto: ");
		System.out.println(dCResultado);
		
		System.out.print("Resultado concatenado: ");
		System.out.println("Resultado entero " + eResultado +  " Resultado decimal incorecto "+ dResultado);

	}	
}
