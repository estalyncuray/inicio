package com.ecuray.distancia;

/**
 * @author Estalyn
 *
 */	

public class Principal {
	
	Punto inicio, fin;
	
	public Principal() {
		inicio = new Punto(10,20);
		fin = new Punto(20,35);
	}
	
	public double getCalcularDistancia() {
		return inicio.getDistancia(fin);
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		double distancia = principal.getCalcularDistancia();
		
		System.out.printf("distancia: %f", distancia);

	}

}
