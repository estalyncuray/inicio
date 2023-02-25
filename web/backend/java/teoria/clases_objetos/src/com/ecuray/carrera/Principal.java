package com.ecuray.carrera;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Estalyn
 * Se va a simular una carrera en la que habran diferenes puntos, es decir un recorrido con diferentes puntos.
 */	

public class Principal {
	
	Recorrido recorrido;
	Random random;
	Scanner teclado; 
	
	public Principal() {
		recorrido = new Recorrido();
		random = new Random();
		teclado = new Scanner(System.in);
	}
	
	public void completarListadoPunto() {
		int longitud = Recorrido.MAX_PUNTOS; 
		for(int i = 0; i < longitud; i++) {
			int x = random.nextInt(100) + 1;
			int y = random.nextInt(50) + 1;
			Punto punto = new Punto(x, y);
			recorrido.addPunto(punto);
		}
	}
	
	public void leerPuntos() {
		String respuesta = "n";
		do {
			try {
				System.out.print("Introducir posición x: ");
				int x = teclado.nextInt();
				System.out.print("Introducir posición y: ");
				int y = teclado.nextInt();
				teclado.nextLine();
				
				Punto punto = new Punto(x, y);
				recorrido.addPunto(punto);
				System.out.print("Desea introducir más puntos (S/N): ");
				respuesta = teclado.nextLine();

			} catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
			}			
		} while(respuesta.equals("s"));
	}
	
	public Punto[] getListado() {
		return recorrido.getPuntos();
	}
	
	public void getDistancia() {
		Punto[] listado = recorrido.getPuntos(); 
		
		for(int i = 0; i< listado.length; i++) {
			System.out.println("["+i+"] "+ listado[i]);
		}
		
		double distancia = recorrido.getDistanciaRecorrido();
		System.out.println("Distancia del recorrido: "+ distancia);
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		
		System.out.print("¿Desea autocompletar el recorrido (S/N)?: ");
		String respuesta = principal.teclado.nextLine();
		
		if(respuesta.equalsIgnoreCase("S")) {
			principal.completarListadoPunto();
		}else {
			System.out.println("Los puntos del recorrido se deben introducir de forma manual");
			principal.leerPuntos();
		}
		
		principal.getDistancia();
	}

}
