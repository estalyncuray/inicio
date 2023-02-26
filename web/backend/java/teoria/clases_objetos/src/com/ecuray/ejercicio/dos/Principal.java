package com.ecuray.ejercicio.dos;

import java.util.Scanner;

/**
 * @author Estalyn
 *
 */
public class Principal {
	
	private Scanner teclado;
	private Torre torre;
	
	public Principal() {
		teclado = new Scanner(System.in);
		torre = new Torre("Torre"); 
	}
	
	
	public void moverTorre() {
		String respuesta = "n";
		System.out.println("Tablero compuesto por\n (X) => A - H \n (Y) => 1 - 8\n");
		do {
			System.out.print("Mover torre (X-Y)?: ");
			String entrada = teclado.nextLine();
			
			String[] movimiento = entrada.split("-");
			if(movimiento.length > 1) {
				X x = X.valueOf(movimiento[0].toUpperCase() + "_");
				Y y = Y.valueOf("_"+movimiento[1]);
				
				if(torre.movimiento(new Posicion(x,y))) {
					System.out.println("Torre - se ha movido ha "+ torre.getPosicion());
				} else {
					System.out.println("Torre - no movimiento valido "+ torre.getPosicion());
				}
			}
			
		System.out.print("Realizar otro movimiento (S/N)?: ");
		respuesta = teclado.nextLine();
		}while(respuesta.equalsIgnoreCase("s"));
	}

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.moverTorre();
		
	}

}
