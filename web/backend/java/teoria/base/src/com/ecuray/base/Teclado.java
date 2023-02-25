package com.ecuray.base;

import java.util.Scanner;

/**
 * @author Estalyn
 *
 */
public class Teclado {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			
			System.out.print("Introducir valor: ");
			int valor = teclado.nextInt();			
			System.out.printf("Se ha introducido el valor: %d", valor);
		} catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
