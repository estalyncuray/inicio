
package com.ecuray.referencia;

/**
 * @author Estalyn
 *
 */
public class Punto {

	private int posX;
	private int posY;
	
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
