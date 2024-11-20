package Refactorizar;

/**
 * 
 * @author Ramon
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		int edades[] = { 20, 25, 30, 35, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19 };

		

		// while (i < edades.length && edadEncontrada == false) {
		// if (edades[i] == 35) {
		// edadEncontrada = true;
		// }
		// i++;
		// }

		if (buscarEdad(edades) == true) {
			System.out.println("Se ha encontrado al menos una persona de 35 años");
		} else {
			System.out.println("No se ha encontrado ninguna persona de 35 años");
		}

	}

	// Funcion que recorre el arrays edades y devuelve si encuentra un 35.
	static boolean buscarEdad(int[] edades) {
		int i = 0;
		boolean edadEncontrada = false;
		while (i < edades.length && edadEncontrada == false) {
			if (edades[i] == 35) {
				edadEncontrada = true;
			}
			i++;
		}
		return edadEncontrada;
	}
}