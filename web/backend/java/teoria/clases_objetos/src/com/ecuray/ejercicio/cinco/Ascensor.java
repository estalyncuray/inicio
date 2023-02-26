package com.ecuray.ejercicio.cinco;


public class Ascensor {

	int pisoActual;
	Puerta puerta;
	int id;
	
	
	public Ascensor (int id){
		this.id = id;
		pisoActual = 0;
		puerta = new Puerta();
	}
	
	public int getId() {
		return id;
	}

	public void mover (int piso){
		if (piso>pisoActual){
			subir (piso);
		}else{
			bajar (piso);
		}
	}
	private void subir(int piso){
		puerta.cerrar();
		
		for ( ; pisoActual<=piso; pisoActual++){
			System.out.println ("Ascensor "+id+" en piso: "+ pisoActual);
		}
		puerta.abrir();
		pisoActual = piso;
	}
	private void bajar(int piso){
		puerta.cerrar();
		
		for (int i = pisoActual; i>=piso; i--){
			pisoActual = i;
			System.out.println ("Ascensor "+id+" en piso: "+ i);
		}
		puerta.abrir();
		pisoActual = piso;
	}

	public int getPisoActual() {
		return pisoActual;
	}
	
}
