package com.ecuray.ejercicio.uno;

/**
 * @author Estalyn
 * 
 */

public class Hora {

	final static int MINUTO_HORA = 60;
	final static int HORA_DIA = 24;
	
	private int hora;
	private int minuto;
	
	public Hora(int hora, int minuto) {
		boolean valido = validarHora(hora, minuto);
		if(valido) {
			this.hora = hora;
			this.minuto = minuto;
		} else {
			throw new RuntimeException("Hora no valida");
		}
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	private boolean validarHora(int hora, int minuto) {
		return (hora >= 0 && hora <= HORA_DIA) && (minuto >= 0 && minuto <= MINUTO_HORA);
	}
	
	public int calcularDiferencia(Hora hora) {
		int diferencia = Math.subtractExact(this.hora*MINUTO_HORA + this.minuto, 
				hora.hora * MINUTO_HORA + hora.minuto);
		return (diferencia > 0) ? diferencia : diferencia * (-1);
	}
		
}
