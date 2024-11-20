import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] votos = new int[6];

		// Preguntamos los votos de los dos partidos
		for (int i = 0; i < votos.length; i++) {
			System.out.print("Votos: ");
			votos[i] = entrada.nextInt();
		}

		// Buscamos mínimo y máximo
		int min = votos[0], max = votos[0];
		int posMin = 0, posMax = 0;

		for (int i = 0; i < votos.length; i++) {

			if (votos[i] < min) {
				min = votos[i];
				posMin = i;
			}

			if (votos[i] > max) {
				max = votos[i];
				posMax = i;
			}
		}

		System.out.println("El partido menos votado ha sido el de la posición " + posMin + ", con " + min + " votos.");
		System.out.println("El partido más votado ha sido el de la posición " + posMax + ", con " + max + " votos.");

	}
}