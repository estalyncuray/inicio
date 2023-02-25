package base;
/**
 * @author Estalyn
 *
 */
public class TipoDeDatoBasico {
	/*
	 * Tipo de datos básico =>
	 * byte - 1 byte
	 * short - 2 byte
	 * int - 4 byte
	 * long - 8 byte
	 * float - 4 byte
	 * double - 8 byte
	 * char - 2 byte
	 * boolean - indeterminado;
	 * */
	byte vByte;
	short vShort;
	int vInt;
	long vLong;
	float vFloat;
	double vDouble;
	char vChar;
	boolean vBoolean;
	/*
	 * Literal =>
	 * Hace referencia al valor que se le asigna a una variable 
	 * long = 4899191989449; se intenta almacenar un valor grande en 4 byte-s (error)
	 * long = 8L; se debe asignar una L para permitir almacenar en 8 byte-s (ok)
	 * */
	byte vLByte = 8;
	long vLLong = 4899191989449L;
	float vLFloat;
	double vLDouble;
	char vLChar = 'a';

}
