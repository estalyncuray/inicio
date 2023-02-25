package com.ecuray.constructor;

/**
 * @author Estalyn
 *
 */	

public class Principal {
	
	/*
	 * Referencia =>
	 * - Punto 'a' - instanciamos el objeto new Punto();
	 * Hacemos que el objeto 'b' apunte hacia 'a' (referenciamos)
	 * 'b' puede consultar los valores de 'a'.
	 * - Punto 'c' - instanciamos el objeto new Punto(); 
	 * Nuevos valores independientes del punto 'a' que se ha instanciado primero
	 * */
	
	public static void main(String[] args) {
		Punto a  = new Punto();
		a.setPosX(4);
		a.setPosY(1);
		
		System.out.printf("Punto 'a' %s\n",a);

		Punto b = new Punto(3,1);
		System.out.printf("Punto 'b' %s\n",b);

	}

}
