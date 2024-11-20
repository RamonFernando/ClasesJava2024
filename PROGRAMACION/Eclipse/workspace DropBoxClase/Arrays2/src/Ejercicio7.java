
public class Ejercicio7 {

	public static void main(String[] args) {

		int[] espectadores = { 2000000, 2500000, 3100000, 1200000, 1800000, 2050000 };

		int min = espectadores[0];
		int max = espectadores[1];

		for (int i = 1; i < espectadores.length; i++) {

			if (espectadores[i] < min) {
				min = espectadores[i];
			}

			if (espectadores[i] > max) {
				max = espectadores[i];
			}
		}

		System.out.println("Audiencia mínima: " + min + " espectadores.");
		System.out.println("Audiencia máxima: " + max + " espectadores.");
	}

}