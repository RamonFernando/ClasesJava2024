
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce 10 alturas en metros");
		double estaturas[] = new double[10];
		boolean alto = false;

		for (int i = 0; i < estaturas.length; i++) {
			estaturas[i] = teclado.nextDouble();
		}

		for (int i = 0; alto == false && i < estaturas.length; i++) {
			if (estaturas[i] > 1.90) {
				alto = true;
				System.out.println("Persona " + i + " mide : " + estaturas[i]);
			}
		}
	}
}