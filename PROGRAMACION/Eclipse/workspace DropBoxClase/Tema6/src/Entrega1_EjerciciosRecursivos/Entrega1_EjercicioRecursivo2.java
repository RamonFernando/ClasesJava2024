package Entrega1_EjerciciosRecursivos;
/**
 * 
 * @author Ramon..
 *
 */
public class Entrega1_EjercicioRecursivo2 {
		// 2.- Realiza el ejercicio anterior con un algoritmo iterativo.
	public static void main(String[] args) {
	    System.out.printf("Binario: %.0f %n ", transforme(120)); 
	}
	
	public static double transforme(int numero){
		int exp, digito;
		double binario;
		exp = 0;
		binario=0;
		while (numero != 0) { // Sigue dividiendo el numero entre dos hasta que
			// este sea 0.
			digito = numero % 2; // Este es el resto de la division por 2.
			binario = binario + digito * Math.pow(10, exp);
			exp++;
			numero = numero / 2;
		}
		return binario;
	}
}

/* 24/2 = 12 % 0
 * 12/2 = 6  % 0
 * 6/2  = 3  % 0
 * 3/2  = 1  % 1
 * 2/2  = 1  % 1
 * 
 * El numero se lee de abajo arriba  de 00011 se lee 11000
 * 
 * 
*/