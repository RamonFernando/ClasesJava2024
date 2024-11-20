public class Ejercicio8 {

	public static void main(String[] args) {

		int[] humedad = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50,
				45 };

		int min = humedad[0], max = humedad[0];
		int posMin = 0, posMax = 0;

		for (int i = 1; i < humedad.length; i++) {
			if (humedad[i] < min) {
				min = humedad[i];
				posMin = i;
			}

			if (humedad[i] > max) {
				max = humedad[i];
				posMax = i;
			}

		}

		System.out.println("Humedad máxima: " + max + ", a las " + posMax + " horas.");
		System.out.println("Humedad mínima: " + min + ", a las " + posMin + " horas.");

	}

}