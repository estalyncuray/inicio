package com.ecuray.array;


/*
 * Una manera clasica de crea un ARRAY, en este caso de Punto
 * Se esta creando 10 referencias a objeto (Punto)
 * */
public class Puntos {

	final static int MAX_PUNTOS = 10; 
	private Punto[] listado;
	private int numPuntos;
	
	public Puntos() {
		numPuntos = 0;
		listado = new Punto[MAX_PUNTOS];
	}
	
	public void addPunto(Punto punto) {
		if(numPuntos >= MAX_PUNTOS)
			return;
		listado[numPuntos] = punto;
		numPuntos++;
	}
	
	/*
	 * Es mejor enviar una copia del array con la longitud actual (numPuntos), 
	 * ya que puede darse el caso de que el usuario no haya introducido la misma cantidad que MAX_PUNTOS
	 * */
	public Punto[] getPuntos() {
		Punto[] copia = new Punto[numPuntos];
		
		for(int i = 0; i<copia.length; i++) {
			copia[i] = listado[i];
		}
		return copia;
	}
	
	public Punto[] getPuntosSystemCopy() {
		Punto[] copia = new Punto[numPuntos];		
		System.arraycopy(listado, 0, copia, 0, numPuntos);
		return copia;
	}
}
