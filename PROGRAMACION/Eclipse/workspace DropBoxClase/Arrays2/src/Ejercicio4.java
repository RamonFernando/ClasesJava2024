import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double productos[] = new double[10];
		boolean preciosCorrectos = true;
		double suma = 0;

		System.out.println("introduce precios: ");
		for (int i = 0; i < productos.length; i++) {
			productos[i] = entrada.nextDouble();
		}

		for (int j = 0; j < productos.length && preciosCorrectos == true; j++) {

			if (productos[j] < 0) {
				System.out.println(
						"se ha encontrado un valor no valido en la posicion: " + j + " .El programa terminara");
				preciosCorrectos = false;
			} else {
				suma = suma + productos[j];
			}
		}

		if (preciosCorrectos == true) {
			System.out.println(suma);
		}

	}

}