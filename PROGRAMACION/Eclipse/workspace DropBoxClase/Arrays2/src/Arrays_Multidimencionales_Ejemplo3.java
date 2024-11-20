import java.util.Scanner;

/**
 * 
 * @author Ramon
 *
 */

public class Arrays_Multidimencionales_Ejemplo3 {

	public static void main(String[] args) {
		// Rellena todos los datos.
		Scanner entrada = new Scanner(System.in);
		double[][][] iluminacion = new double[5][3][4];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {

					System.out.println("(" + i + "," + j + "," + k + ")? ");
					iluminacion[i][j][k] = entrada.nextDouble();

				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
				System.out.println("Coordenadas (" + i + "," + j + "," + k +")?");
				System.out.println(iluminacion[i][j][k]);
				}
			}
		}

		entrada.close();
	}

}
