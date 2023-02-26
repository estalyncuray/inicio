package com.ecuray.ejercicio.tres;

/**
 * @author Estalyn
 * puerta (cerrada = false)
 */
public class Ascensor {
	private int id;
	private int piso;
	private boolean puerta;
	
	public Ascensor(int id) {
		this.id = id;
		this.piso = 0;
		this.puerta = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public boolean isPuerta() {
		return puerta;
	}

	public void setPuerta(boolean puerta) {
		this.puerta = puerta;
	}

	@Override
	public String toString() {
		return "Ascensor [piso=" + piso + ", puerta=" + puerta + "]";
	}
	
	public int  mover (int piso){
		int resultado = 0;
		if(this.piso < piso) {
			resultado = subir(piso);
		} else {
			resultado = bajar(piso);
		}
		return resultado;
	}
	
	private int subir(int piso) {
		this.piso = piso;
		return 0;
	}
	
	private int bajar(int piso) {
		this.piso = piso;
		return 1;
	}
}
