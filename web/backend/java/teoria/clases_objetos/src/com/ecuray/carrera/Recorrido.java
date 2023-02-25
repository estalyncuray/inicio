package com.ecuray.carrera;


/*
 * Una manera clasica de crea un ARRAY, en este caso de Punto
 * Se esta creando 10 referencias a objeto (Punto)
 * */
public class Recorrido {

	final static int MAX_PUNTOS = 10; 
	private Punto[] listado;
	private int numPuntos;
	
	public Recorrido() {
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
	
	private Punto[] getPuntosCopy() {
		Punto[] copia = new Punto[numPuntos];
		System.arraycopy(listado, 0, copia, 0, numPuntos);
		return copia;
	}
	/*
	 * Calcular la distancia de cada punto con el siguiente
	 * i = 0; (4,3)
	 * j = 1; (4,3) (5,2)
	 * 
	 * */
	public double getDistanciaRecorrido() {
		double distancia = 0.0;
		Punto[] copia = getPuntosCopy();

//		int longitud = copia.length;
//		for(int i = 0; i< longitud - 1; i++) {
//			int j = i + 1;
//			Punto a = copia[i];
//			Punto b = copia[j];
//			distancia += a.getDistancia(b);
//		}
		
		for(int i = 0; i< copia.length - 1; i++) {
			distancia += copia[i].getDistancia(copia[i+1]);
		}
		
		return distancia;
	}
	
}
