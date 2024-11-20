
/**
 * 
 * @author Ramón
 *
 */
// Esto es un array bidimencional.
import java.util.Scanner;

public class Arrays13 {

	public static void main(String[] args) {
		// La tabla siguiente muestra tres magnitudes meteorológicas medidas en
		// cuatro momentos del día. Guarda estos datos en un array bidimensional
		// llamado medidas.
		// A continuación muestra en la pantalla estas medidas fila a fila:
		Scanner entrada = new Scanner(System.in);
		double[][] medidas = { { 8.5, 1020, 40 }, { 14.2, 1021, 35 }, { 11, 1022, 45 }, { 7, 1023, 50 } };
		System.out.println("  Tabla de medidas \n====================");
		for (int i = 0; i < medidas.length; i++) {

			System.out.print(medidas[i][0] + "\t");
			System.out.print(medidas[i][1] + "\t");
			System.out.println(medidas[i][2]);

		}

		entrada.close();
	}

}