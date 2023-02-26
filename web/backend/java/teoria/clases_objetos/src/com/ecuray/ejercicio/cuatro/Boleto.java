package com.ecuray.ejercicio.cuatro;



public class Boleto {
	
	public static final int NUMNUMEROS = 6;
	int numeros[];
	int numAciertos = 0;
	boolean evaluado;
	
	
	
	public Boleto(int numeros[]){
		this.numeros = numeros;
		evaluado = false;
	}
	
	public int[] getNumeros() {
		int [] valores = new int [numeros.length];
		System.arraycopy(numeros, 0, valores, 0, numeros.length);
		return valores;
	}

	public int getNumAciertos() {
		return numAciertos;
	}

	public int calcularAciertos (int combinacionGanadora[]){
		
		for (int numero : numeros){
			for (int valor : combinacionGanadora){
				if (numero == valor){
					numAciertos++;
				}
			}
		}
		evaluado = true;
		return numAciertos;
	}

	
	public String aString() {
		String boleto ="";
		for (int numero : numeros){
			boleto += (numero+" ");
		}
		boleto += "      Numero de aciertos: ";
		boleto += (evaluado)? numAciertos: "No evaluado";
		return boleto;
	}
	
}
