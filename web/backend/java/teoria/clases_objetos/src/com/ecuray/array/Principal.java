package com.ecuray.array;

import java.util.Random;

/**
 * @author Estalyn
 *
 */	

public class Principal {
	
	Puntos listado;
	Random random;
	
	public Principal() {
		listado = new Puntos();
		random = new Random();
	}
	
	public void completarListadoPunto() {
		int longitud = Puntos.MAX_PUNTOS; 
		for(int i = 0; i < longitud; i++) {
			int x = random.nextInt(100) + 1;
			int y = random.nextInt(50) + 1;
			Punto punto = new Punto(x, y);
			listado.addPunto(punto);
		}
	}
	
	public Punto[] getListado() {
		return listado.getPuntos();
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.completarListadoPunto();
		Punto[] listado = principal.getListado(); 

		for(Punto punto : listado) {
			System.out.println(punto);
		}
	}

}
