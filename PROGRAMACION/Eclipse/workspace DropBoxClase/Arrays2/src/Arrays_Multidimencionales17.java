/**
 * 
 * @author Ramon.
 *
 */

public class Arrays_Multidimencionales17 {

	public static void main(String[] args) {

		// 17.- Un edificio dispone de 3x3x3 oficinas (3x3 oficinas en cada una
		// de sus 3 plantas), formando un cubo.
		// Crea un array con estas dimensiones llamado temperaturas que permita
		// almacenar, en un instante dado, la temperatura de cada oficina.
		// Invéntate 5 valores de temperatura y guárdalos en el array.
		// Calcula la suma de todas las temperaturas del array (las que no has
		// introducido son cero).
		// Calcula la temperatura media de las 5 habitaciones mediante un bucle.

		double[][][] temp = new double[3][3][3];
		double suma=0;
		double media;
		
		temp [1][0][0] = 5;
		temp [2][0][0] = 5;
		temp [1][0][1] = 5;
		temp [2][2][0] = 5;
		temp [2][0][2] = 5;
		
		
			for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					suma = suma + temp[i][j][k];
					
				}
			}

		}
			System.out.println("Suma: " + suma);
			media = suma / 5;
			System.out.println(media);
					
					
	}

}
