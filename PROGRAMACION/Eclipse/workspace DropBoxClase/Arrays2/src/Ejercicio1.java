
/**
 * 
 * @author Ramon
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		int edades[] = { 20, 25, 30, 35, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19 };

		boolean edadEncontrada = false;
		int i = 0;

		while (i < edades.length && edadEncontrada == false) {
			if (edades[i] == 35) {
				edadEncontrada = true;
			}
			i++;
		}

		if (edadEncontrada == true) {
			System.out.println("Se ha encontrado al menos una persona de 35 años");
		} else {
			System.out.println("No se ha encontrado ninguna persona de 35 años");
		}

	}
}
