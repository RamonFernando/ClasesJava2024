import java.util.Scanner;

/**
 * 
 * Continuacion del ejercicio 7.
 *
 */
public class Arrays8 {

	public static void main(String[] args) {
		// 8.- Modifica el programa anterior para que el programa pare de pedir
		// notas si se le pasa un valor negativo.
		Scanner entrada = new Scanner(System.in);

		double Notas[] = new double[10];

		System.out.println("Introduzca nota:");
		

		System.out.println("Notas de alumnos: \n <<<<<<<>>>>>>>");

		int i = 0;
		while (i < Notas.length) {
			System.out.println("Notas: " + (i+1));
			Notas[i] = entrada.nextDouble();
			if (Notas[i] < 0) {
				break;
			}
			i++;
		}
		for (int j = 0; j < Notas.length; j++) {
			System.out.println("Nota " + (j+1) + ": " + Notas[j]);
		}

		entrada.close();
	}

}
