
/**
 * 
 * @author Ramon
 *
 */
import java.util.Scanner;

public class Arrays_Multidimencionales_Ejemplo2 {

	public static void main(String[] args) {
		// El programa te preguntara en que habitacion estas y que luz tienes
		// que fila y que columna. Edificio que tiene 5 filas de 3 habitaciones
		// cada una.

		Scanner entrada = new Scanner(System.in);
		double[][][] iluminacion = new double[5][3][4];

		System.out.println("Fila: ");
		int fila = entrada.nextInt();
		System.out.println("Columna");
		int columna = entrada.nextInt();
		System.out.println("Habitacion: ");
		int habitacion = entrada.nextInt();
		System.out.println("Nivel de iluminacion: ");
		double luz = entrada.nextDouble();
		iluminacion[fila][columna][habitacion] = luz;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
					System.out.println(
							"Iluminacion de despacho: " + i + ", " + j + ", " + k + ", " + "= " + iluminacion[i][j][k]);
				}
			}
		}
		System.out.println("\n" + "Fila: " + fila + " Columna: " + columna + " Habitacion: " + habitacion
				+ " Nivel de iluminacion: " + luz);
		
		entrada.close();
	}

}
