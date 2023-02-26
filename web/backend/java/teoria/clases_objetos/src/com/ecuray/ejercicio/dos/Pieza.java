package com.ecuray.ejercicio.dos;

/**
 * @author Estalyn
 *
 */
public class Pieza {
	
	private String nombre;
	private Posicion posicion;
	
	public Pieza(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Pieza [nombre=" + nombre + ", posicion=" + posicion + "]";
	}
		
}
