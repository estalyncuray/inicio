package com.ecuray.ejercicio.cinco;



public class ControladorAscensores {

	Ascensor lista[];
	int numAscensores;
	public ControladorAscensores(int numAscensores){
		lista = new Ascensor [numAscensores];
		
		this.numAscensores = numAscensores;
		for (int i = 0; i<this.numAscensores;i++){
			lista[i]= new Ascensor(i);
		}
	}
	
	public void llevarAscensorAPiso( int piso){
		int numAscensorMasCercano = 0;
		int distancia;
		int minimaDistanciaEnPisos = Math.abs( piso - lista[0].getPisoActual());
		for (int i = 1; i<this.numAscensores; i++){
			distancia = Math.abs( piso - lista[i].getPisoActual());
			if (distancia<minimaDistanciaEnPisos){
				numAscensorMasCercano = i;
				minimaDistanciaEnPisos = distancia;
			}
		}
		lista[numAscensorMasCercano].mover(piso);
	}
	public void moverAscensorAPiso(int numAscensor,int piso){
		lista[numAscensor].mover(piso);
	}
	
}
