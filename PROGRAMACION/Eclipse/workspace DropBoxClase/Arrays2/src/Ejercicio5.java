public class Ejercicio5 {

	public static void main(String[] args) {

		double[] temperaturas = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double min = temperaturas[0], max = temperaturas[0];
		int posMin = 0, posMax = 0;

		for (int i = 1; i < temperaturas.length; i++) {

			if (temperaturas[i] < min) {
				min = temperaturas[i];
				posMin = i;
			}

			if (temperaturas[i] > max) {
				max = temperaturas[i];
				posMax = i;
			}

		}

		System.out.println("La temperatura menor es " + min + " en la posición " + posMin);
		System.out.println("La temperatura mayor es " + max + " en la posición " + posMax);
	}

}