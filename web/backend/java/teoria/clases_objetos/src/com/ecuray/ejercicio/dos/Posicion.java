package com.ecuray.ejercicio.dos;

public class Posicion {

	private X x;;
	private Y y;
	
	public Posicion(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	public X getX() {
		return x;
	}

	public void setX(X x) {
		this.x = x;
	}

	public Y getY() {
		return y;
	}

	public void setY(Y y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Posicion [x=" + x.getNombre() + ", y=" + y.getNombre() + "]";
	}
		
}
