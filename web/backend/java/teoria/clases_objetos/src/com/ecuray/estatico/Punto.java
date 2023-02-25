
package com.ecuray.estatico;

/**
 * @author Estalyn
 *
 */
/*
 * static =>
 * El valor asignado a una variable 'static' se almacena directamente en la clase y no en el objeto. 
 * El objeto puede tener acceso a ese valor e incluso actualizarlo.
 * Se puede acceder de esta manera Punto.contador++;
 * */
public class Punto {

	private int posX;
	private int posY;
	
	static int contador = 0;

	public Punto() {
		super();
	}

	public Punto(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
		contador++;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	@Override
	public String toString() {
		return "Punto [posX=" + posX + ", posY=" + posY + "]";
	}	
}
