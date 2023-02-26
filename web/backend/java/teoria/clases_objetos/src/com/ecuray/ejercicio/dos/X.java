package com.ecuray.ejercicio.dos;

/**
 * @author Estalyn
 *
 */
public enum X {

	A_("A"),
	B_("B"),
	C_("C"),
	D_("D"),
	E_("E"),
	F_("F"),
	G_("G"),
	H_("H");
	
	private String nombre;

	private X(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
