package com.ecuray.ejercicio.cuatro;

public class Sorteo {

	int maxBoletos;
	Boleto lista [];
	int numBoletos;
	
	public Sorteo(int maxBoletos){
		this.maxBoletos = maxBoletos;
		lista = new Boleto [maxBoletos];
		numBoletos = 0;
	}
	
	public void añadir(Boleto boleto){
		lista[numBoletos++] = boleto;
	}

	public void evaluarBoletos (int[] combinacionGanadora) {
				
		for (int i = 0; i< numBoletos;i++){
			lista[i].calcularAciertos(combinacionGanadora);
		}
		
	}
	public Boleto [] getBoletosSorteo(){
		Boleto copia [] = new Boleto [numBoletos];
		System.arraycopy(lista, 0, copia, 0, numBoletos);
		return copia;
	}

}
