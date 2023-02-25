
package com.ecuray.constructor;

/**
 * @author Estalyn
 *
 */
/*
 * Sobrecarga de funciones => 
 * Hace referencia en este caso a que existen más de un constructor Punto(), pero 
 * uno esta vacío (sin parametros) y el otro necesita un campos/parametros de entrada.
 * En resumen se puede repetir el nombre de la función, pero siempre y cuando cada una tenga diferentes parametros
 * */
public class Punto {

	private int posX;
	private int posY;
	/*[1]
	 *Constructor vacio (por defecto Java define un constructor vacio)
	 */
	public Punto() {
		super();
	}
	/*[2]
	 *Constructor con campos especificos, necesarios para la aplicación
	 */
	public Punto(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
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
