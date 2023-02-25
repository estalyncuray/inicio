
package base;

/**
 * @author Estalyn
 *
 */
public class OperadorDesplazamiento {

	/*
	 * Desplazamiento de bits =>
	 * >> desplazar x bits a la derecha
	 * << desplazar x bits a la izquierda (bit más significativo, es del signo si esta a 1, rellena todo de 1)
	 * >>> desplazar x bits a la derecha (ignora el bit de signo y siempre los rellenar de 0)
	 * */
	public static void main(String[] args) {
		int valor = 0x00000001;
		valor = valor << 4; //valor = 0x00001000;
		
		System.out.printf("El resultado es (hexadecimal) %x, (decimal) %d\n", valor, valor);
		
		valor = 0x80000001;
		valor = valor >> 4;
		System.out.printf("El resultado es (hexadecimal) %x, (decimal) %d (rellenar huecos con 1)\n", valor, valor);
		
		valor = 0x80000001;
		valor = valor >>> 4;
		System.out.printf("El resultado es (hexadecimal) %x, (decimal) %d (rellenar huecos con 0)\n", valor, valor);
	}

}
