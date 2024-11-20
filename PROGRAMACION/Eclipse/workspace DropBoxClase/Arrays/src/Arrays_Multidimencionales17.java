/**
 * 
 * @author Ramón.
 *
 */
public class Arrays_Multidimencionales17 {

	public static void main(String[] args) {
		// Un edificio dispone de 3x3x3 oficinas (3x3 oficinas en cada una de
		// sus 3 plantas), formando un cubo.
		// Crea un array con estas dimensiones llamado temperaturas que permita
		// almacenar, en un instante dado, la temperatura de cada oficina.
		// Invéntate 5 valores de temperatura y guárdalos en el array.
		// Calcula la suma de todas las temperaturas del array (las que no has
		// introducido son cero).
		// Calcula la temperatura media de las 5 habitaciones mediante un bucle

		double Temperaturas[][][] = new double[3][3][3];

		Temperaturas[0][0][0] = 5;
		Temperaturas[0][0][1] = 10;
		Temperaturas[0][0][2] = 15;
		Temperaturas[1][0][0] = 20;
		Temperaturas[1][0][1] = 25;

		double suma = 0, media = 0;

		for (int i = 0; i < Temperaturas.length; i++) {
			for (int j = 0; j < Temperaturas[0].length; j++) {
				for (int k = 0; k < Temperaturas[0][0].length; k++) {
					suma = suma + Temperaturas[i][j][k];

				}
			}
		}
		System.out.println(suma);
		media = suma / 5;
		// Comentatio: media = suma / (Temperaturas.length *
		// Temperaturas[0].length * Temperaturas[0][0].length);//
		System.out.println("Temperatura media: " + media);
	}
}