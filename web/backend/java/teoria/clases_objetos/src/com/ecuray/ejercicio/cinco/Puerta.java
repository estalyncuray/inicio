package com.ecuray.ejercicio.cinco;



public class Puerta  {

	boolean estado; //true abierta --- false cerrada
	
	public Puerta (){
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void cerrar() {
		if (estado == true){
			System.out.println("Se cierra la pueta");
			estado = false;
		}
		
	}

	public void abrir() {
		if (estado == false){
			System.out.println("Se abre la puerta");
			estado = true;
		}
		
	}

}
