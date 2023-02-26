package com.ecuray.ejercicio.uno;

/**
 * @author Estalyn
 *
 */
public class Principal {

	
	public Principal() {
		super();
	}
	
	public void calcularDiferenciaMinutos(Hora primero, Hora segundo) {
		int diferencia = primero.calcularDiferencia(segundo);
		System.out.println("Ejecicio 1");
		System.out.printf("Diferencia %d", diferencia);
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		// [1]
		principal.calcularDiferenciaMinutos(new Hora(25,30), new Hora(11,50));
	}

}
