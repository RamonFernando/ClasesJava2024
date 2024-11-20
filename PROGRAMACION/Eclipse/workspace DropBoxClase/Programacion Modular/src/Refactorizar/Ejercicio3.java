package Refactorizar;

/**
 * @author Ramon
 */
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[] nombres = new String[10];
		boolean nadie = false;
		int i;
		int j = 0;

		for (i = 0; i < nombres.length && nadie == false; i++) {
			System.out.print("Nombre: ");
			nombres[i] = teclado.nextLine();
			if (nombres[i].equals("nadie")) {
				nadie = true;
			}
		}

		boolean nombreEncontrado = false;
		while (j < nombres.length && !nombres[j].equals("nadie") && nombreEncontrado == false) {
			if (nombres[j].equals("calderon")) {
				nombreEncontrado = true;
				System.out.println(nombres[j] + " de la Barca.");
			}
			j++;
		}

		if (nombreEncontrado == false) {
			System.out.println("Nombre no encontrado.");
		}
		teclado.close();
	}
}