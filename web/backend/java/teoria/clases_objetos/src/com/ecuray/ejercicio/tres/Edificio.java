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
	
	public void llevarAscensorAPiso( int piso){
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
		mover(piso, ascensores[numAscensorMasCercano].getPiso(),ascensores[numAscensorMasCercano].getId());
		ascensores[numAscensorMasCercano].setPiso(piso);
	}
	
	public void moverAscensorAPiso(int numAscensor,int piso){
		mover(piso, ascensores[numAscensor].getPiso(),ascensores[numAscensor].getId());
		ascensores[numAscensor].setPiso(piso);
	}
	
	private void mover(int piso, int pisoActual, int id) {
		if(pisoActual < piso) {
			System.out.println("Pueta abierta");
			for(int i = pisoActual; i < piso; i++) {
				System.out.printf("Ascensor %d en piso %d: \n", id, i + 1);
			}
			System.out.println("Pueta cerrada");
		} else {
			System.out.println("Pueta abierta");
			for(int i = pisoActual; i>= piso; i--) {
				System.out.printf("Ascensor %d en piso %d: \n", id, i);
			}
			System.out.println("Pueta cerrada");
		}
	}
}
