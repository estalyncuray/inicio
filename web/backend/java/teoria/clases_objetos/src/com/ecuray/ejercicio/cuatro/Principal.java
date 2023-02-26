package com.ecuray.ejercicio.cuatro;

import java.util.Random;
import java.util.Scanner;


public class Principal {

	
	private static final int NUMBOLETOS = 3;
	
	Sorteo sorteo;
	
	Scanner teclado = new Scanner (System.in);
	int combinacionGanadora[];
	 
	public Principal(){
		sorteo = new Sorteo(NUMBOLETOS);
		
	}
	public int menu() {
		int opcion;
		System.out.println("1. registrar Boleto");
		System.out.println("2. generar combinacion ganadora y valorar boletos");
		System.out.println("3. mostrar boletos");
		System.out.println("0. Salir");
		System.out.print("Seleccione opcion: ");
		opcion = teclado.nextInt(); teclado.nextLine();
		return opcion;
	}
	public void gestionarBonoloto(){
		int opcion;
		do{
			
			switch (opcion=menu()){
			case 1: registrarBoleto(); break;
			case 2: generarCombinacionGanadora(); break;
			case 3: mostrarBoletos();break;
			case 0: break;
			default: System.out.println( "Opcion no valida");
			}
			
		}while ( opcion !=0);
	}
	
	
	private void mostrarBoletos() {
		Boleto lista [] = sorteo.getBoletosSorteo();
		System.out.println();
		for (Boleto boleto: lista){
			System.out.println(boleto.aString());
		}
	}

	private void generarCombinacionGanadora() {
		Random generador = new Random();
		
		this.combinacionGanadora = new int [Boleto.NUMNUMEROS];
		
		System.out.print("La combinacion ganadora es: ");
		for (int i = 0; i<Boleto.NUMNUMEROS; i++){
			int valor = generador.nextInt(49)+1;
			this.combinacionGanadora[i] = (valor);
			System.out.print (valor+" ");
		}
		System.out.println();
		sorteo.evaluarBoletos(combinacionGanadora);
	}

	private void registrarBoleto() {
		int numeros[] = new int[Boleto.NUMNUMEROS];
		Boleto boleto;
		
		System.out.print ("introduce los numeros");
		for (int i = 0; i<Boleto.NUMNUMEROS; i++){
			numeros [i] = teclado.nextInt();
		}
		boleto = new Boleto (numeros);
		sorteo.añadir(boleto);
	}

	public static void main(String[] args) {
		Principal ejercicio = new Principal();
		ejercicio.gestionarBonoloto();

	}

}
