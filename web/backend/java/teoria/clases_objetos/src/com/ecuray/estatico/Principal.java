package com.ecuray.estatico;

/**
 * @author Estalyn
 *
 */	

public class Principal {
	

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Punto a  = new Punto(1,2);
		Punto b = new Punto(2,3);
		Punto c = new Punto(3,4);
		
		int contador = Punto.contador;
		
		System.out.printf("El objeto punto se ha instanciado %d veces", contador);

	}

}
