package com.ecuray.ejercicio.tres;

import java.util.Scanner;

/**
 * @author Estalyn
 *
 */
public class Principal {

	private Edificio edificio;
	private Scanner teclado;
	
	public Principal() {
		edificio = new Edificio();
		teclado = new Scanner(System.in);
	}
	
	public void iniciarEdificio() {
		for(int i = 0; i < Edificio.MAX_ASCENSORES; i++) {
			edificio.add(new Ascensor(i));
		}
	}
	
	public int leerOpciones() {
		System.out.println("1.-Mover ascensor a piso");
		System.out.println("2.-Llamar ascensor desde piso");
		System.out.println("0.-Salir");
		
		System.out.print("Selecciona opción: ");
		return teclado.nextInt();
	}
	
	public void movimiento() {
		int opcion = 0;
		
		do {
			opcion = leerOpciones();
			switch(opcion) {
			case 1: 
				ascensorAPiso();
				break;
			case 2: 
				ascensorDesdePiso();
				break;
				default:
			}
		} while(opcion != 0);
	}
	
	public void ascensorDesdePiso() {
		System.out.print("Indica que piso?: ");
		int piso = teclado.nextInt();
		teclado.nextLine();
		
		edificio.llevarAscensorAPiso(piso);
	}
	
	public void ascensorAPiso() {
		System.out.print("Indica que ascensor: ");
		int id = teclado.nextInt();
		System.out.print("A que piso?: ");
		int piso = teclado.nextInt();
		teclado.nextLine();
		
		if(edificio.existe(id)) {
			edificio.moverAscensorAPiso(id, piso);
		}				
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.iniciarEdificio();
		principal.movimiento();

	}

}
