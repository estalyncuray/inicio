package com.ecuray.ejercicio.tres;

public class Edificio {
	final static int MAX_ASCENSORES = 3;
	private int cantidad;
	Ascensor[] ascensores;
	
	public Edificio() {
		this.cantidad = 0;
		ascensores = new Ascensor[MAX_ASCENSORES];
	}
	
	public void add(Ascensor ascensor) {
		if(cantidad < MAX_ASCENSORES) {
			ascensores[cantidad++] = ascensor;
		}
	}
	
	public Ascensor[] getAscensores() {
		Ascensor[] copia = new Ascensor[cantidad];
		System.arraycopy(ascensores, 0, copia, 0, cantidad);
		return copia;
	}
	
	public boolean existe(int id) {
		Ascensor[] copia = getAscensores();
		for(Ascensor ascensor : copia) {
			if(ascensor.getId() == id) 
				return true;
		}
		return false;
	}
	
	public int llevarAscensorAPiso( int piso){
		int numAscensorMasCercano = 0;
		int distancia;
		int minimaDistanciaEnPisos = Math.abs( piso - ascensores[0].getPiso());
		for (int i = 1; i<this.cantidad; i++){
			distancia = Math.abs( piso - ascensores[i].getPiso());
			if (distancia<minimaDistanciaEnPisos){
				numAscensorMasCercano = i;
				minimaDistanciaEnPisos = distancia;
			}
		}
		return ascensores[numAscensorMasCercano].mover(piso);
	}
	
	public int moverAscensorAPiso(int numAscensor,int piso){
		return ascensores[numAscensor].mover(piso);
	}
}
