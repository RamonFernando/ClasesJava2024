import java.util.Scanner;

public class EjemploArrays {

	static Scanner entrada = new Scanner(System.in);
	static String[] palabras = new String[10];

	public static void main(String[] args) {
		//

		relleno();
		busqueda("ordenador");
		System.out.println(busqueda("ordenador"));
	}

	static void relleno() {
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Valor " + i + "? ");
			palabras[i] = entrada.nextLine();
		}
	}

	static int busqueda(String palabra) {
		// Busqueda de la palabra "ordenador"
		int pos = -1;
		int i = 0;
		while (i < palabras.length && pos == -1) {
			if (palabras[i].equals(palabra)) {
				pos = i;

			}
			i++;
		}
		return pos;
	}

	static boolean busqueda2(String palabra) {
		// Busqueda que te devuelva true o false.
		int pos = -1;
		int i = 0;
		while (i < palabras.length && pos == -1) {
			if (palabras[i].equals(palabra)) {
				pos = i;

			}
			i++;
		}
		if (pos == -1) {
			return false;
		} else {
			return true;
		}
	}
}