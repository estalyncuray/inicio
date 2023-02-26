package com.ecuray.ejercicio.cinco;


import java.util.Scanner;


public class Principal  {

	final int NUMASCENSORES = 3;
	ControladorAscensores controlador;
	Scanner teclado;
	
	public Principal(){
		controlador = new ControladorAscensores(NUMASCENSORES);
		teclado = new Scanner (System.in);
	}
	
	public void gestionarAscensores(){
		int opcion;
		do{
			System.out.println("1.- Mover ascensor a piso");
			System.out.println("2.- Llamar ascensor desde piso");
			System.out.println("0.- Salir");
			System.out.print("Selecciona opci�n: ");
			opcion = teclado.nextInt();
			
			switch (opcion){
			case 1: moverAscensor();break;
			case 2: llamarAscensor();break;
			case 0: break;
			default:  System.out.println("Opci�n no v�lida");
			}
			
		}while(opcion != 0);
		teclado.close();
	}
	private void llamarAscensor() {
		int piso;
		System.out.print ("Desde que piso?: ");
		piso = teclado.nextInt();
		controlador.llevarAscensorAPiso(piso);
		
	}

	private void moverAscensor() {
		int piso,numAscensor;
		System.out.print("Indica que ascensor:");
		numAscensor = teclado.nextInt();
		System.out.print ("A que piso?: ");
		piso = teclado.nextInt();
		if ((numAscensor>=0)&&(numAscensor<NUMASCENSORES)){
			controlador.moverAscensorAPiso(numAscensor,piso);
		}
		
	}

	public static void main(String[] args) {
		Principal ejercicio = new Principal();
		ejercicio.gestionarAscensores();
	}

}
