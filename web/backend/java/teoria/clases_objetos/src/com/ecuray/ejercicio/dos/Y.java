package com.ecuray.ejercicio.dos;

/**
 * @author Estalyn
 *
 */
public enum Y {
	_1("1"),
	_2("2"), 
	_3("3"),
	_4("4"),
	_5("5"),
	_6("6"),
	_7("7"),
	_8("8");
	
	private String nombre;
	
	Y(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isYenRango(Y valor) {
	
		for(Y y: Y.values()) {
			if(y.equals(valor)) {
				return true;
			}
		}
		return false;
	}
}
