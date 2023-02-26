package com.ecuray.ejercicio.dos;

/**
 * @author Estalyn
 *
 */
/*
 * Parte en relación a los conceptos de Herencia
 * */
public class Torre extends Pieza{

	public Torre(String nombre) {
		super(nombre);
	}
	
	public boolean movimiento(Posicion posicion) {
		boolean validar = false;
		
		if(posicion.getX().equals(X.H_) || posicion.getX().equals(X.A_)) {
			if(posicion.getY().isYenRango(posicion.getY())) {
				this.setPosicion(posicion);
				validar = true;
			}
		}
		return validar;
	}
		
}
