package com.ecuray.base;

/**
 * @author Estalyn
 *
 */
public class ArraySentencias {

	/*
	 * Primero se declara un array int[], pero no se puede usar directamente
	 * sin primero haber creado ese array
	 * 1 - Nos dice que estas asignado un valor a un array que no se ha creado (Null Pointer Exception)
	 *  int[] listado;
		listado[0] = 1;
	 * 2 - Se crea el array con un limite, ahora se podrá asignar un valor al array
	 * 3 -  una vez inicializado no se puede volver asignar de esta manera, habría que ir valor a valor 
	 * 4 - Sentencia IF
	 * 5 - Sentencia SWITCH
	 * 6 - Sentencia BUCLE
	 * */
	
	public static void main(String[] args) {
		int[] listado = new int[2];
		listado[0] = 1;
		listado[1] = 3;
		
		// listado = {1,2,3,4}; (ERROR)
		
		if(listado[0] < 1) {
			System.out.printf("array -> posición [%d] = %d (es menor) \n", 0, listado[0]);
		} else {
			System.out.printf("array -> posición [%d] = %d (es mayor) \n", 0, listado[0]);
		}
		
		switch(listado[1]) {
		case 1:
			System.out.printf("array -> posición [%d] = %d (es 1) \n", 0, listado[0]);
			break;
			default:
				System.out.printf("array -> posición [%d] = %d (es distinto de 1) \n", 0, listado[0]);
		}
		int longitud = listado.length;
		System.out.println("Recorrer listado FOR");
		for(int i = 0; i< longitud; i++) {
			System.out.printf("array -> posición [%d] = %d\n", i, listado[i]);
		}
		System.out.println("Recorrer listado DO-WHILE (se entra y luego se evalua)");
		int i= 0;
		do {
			System.out.printf("array -> posición [%d] = %d\n", i, listado[i]);
			i++;
		} while(i < longitud);
		System.out.println("Recorrer listado WHILE (se evalua y luego se entra)");
		i = 0;
		while(i < longitud) {
			System.out.printf("array -> posición [%d] = %d\n", i, listado[i]);
			i++;
		}
		System.out.println("Recorrer listado FOREACH (se asigna el valor a una variable)");
		for(int valor: listado) {
			System.out.printf("array -> valor = %d\n", valor);
		}
	}

}
