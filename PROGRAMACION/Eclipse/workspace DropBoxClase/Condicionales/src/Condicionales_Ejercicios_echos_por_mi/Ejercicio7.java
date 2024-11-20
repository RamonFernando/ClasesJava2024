package Condicionales_Ejercicios_echos_por_mi;

import java.util.Scanner;

/**
 * 
 * @author Ramon.
 *
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		// 7.- Juego de adivinar el número secreto. El ordenador nos preguntará
		// un número del 1 al 10. Si coincide con el número secreto (que habrás
		// codificado como una constante entera) nos felicitará. Si no, nos dirá
		// que hemos fallado.
		Scanner entrada = new Scanner(System.in);

		final int NUM;
		System.out.println("Introduzca un numero entre 1 y 10: ");
		NUM = entrada.nextInt();

		if (NUM > 10) {
			System.out.println("Por favor introduzca el numero correcto");

		}

		if (NUM == 4) {
			System.out.println("Felicidades, has acertado.");

		}
		if (NUM != 4) {
			System.out.println("Has fallado");
		}

		entrada.close();
	}

}
