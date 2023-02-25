
package com.ecuray.carrera;

/**
 * @author Estalyn
 *
 */

public class Punto {

	private int posX;
	private int posY;

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
	
	private double getDistanciaPosX(Punto p) {
		return p.getPosX() - this.posX;
	}
	
	private double getDistanciaPosY(Punto p) {
		return p.getPosY() - this.posY;
	}
	
	public double getDistancia(Punto p) {
		double distancia = 0.0;
		distancia = Math.sqrt(Math.pow(this.getDistanciaPosX(p), 2.0) + Math.pow(this.getDistanciaPosY(p), 2.0));
		return distancia;
	}
}
