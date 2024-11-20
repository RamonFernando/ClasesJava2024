
/**
 * 
 * @author Ramón.
 *
 */
import java.util.Scanner;

public class Arrays_5_y_6_Examen {

	public static void main(String[] args) {
		// Crea un arrays donde se guarde el nombre, apellidos y edad de 5
		// personas
		// Leera los datos desde el teclado
		// Mostrará los datos por pantalla
		// Calcular la edad media de las 5 personas del array.
		// Encontrar la edad mínima y máxima.
		Scanner entrada = new Scanner(System.in);
		String[][] daw = new String[5][3];
		
		int posMin = 0;
		int posMax = 0;
		int media;
		int total = 0;

		for (int i = 0; i < daw.length; i++) {
			System.out.println("Escribe nombre: ");
			daw[i][0] = entrada.nextLine();
			System.out.println("Escribe apellidos: ");
			daw[i][1] = entrada.nextLine();
			System.out.println("Escriba edad: ");
			daw[i][2] = entrada.nextLine();

		}
		

		for (int i = 0; i < daw.length; i++) {

			System.out.println("Nombre, Apellidos y Edad: " + daw[i][0] + " " + daw[i][1] + " " + daw[i][2]);

		}

		for (int i = 0; i < daw.length; i++) {

			total = total + Integer.parseInt(daw[i][2]);

			if (Integer.parseInt(daw[posMin][2]) > Integer.parseInt(daw[i][2])) {
				posMin = i;

			}
			if (Integer.parseInt(daw[posMax][2]) < Integer.parseInt(daw[i][2])) {
				posMax = i;
			}
		}

		// para hacer esta operacion hay que salir del bucle for por que si no
		// voy ha hacer una division cada ves que calcule el total. Cada ves que
		// sumes dividirias entre 5.
		// Suma de componentes entre el total de componentes (Asi se calcula la
		// media)
		// total = total/5;
		// out of bounds (Significa que se esta saliendo del arrays)

		media = total / daw.length;

		System.out.println("Posicion mínima: " + Integer.parseInt(daw[posMin][2]));
		System.out.println("Posicion máxima: " + Integer.parseInt(daw[posMax][2]));
		System.out.println("Media de edades: " + media);
	
	entrada.close();
	}

}
