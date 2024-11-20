
/**
 * 
 * @author Ramon.
 *
 */
import java.util.Scanner;

public class Rep_Iosmany_arrays_2 {

	public static void main(String[] args) {
		// Crea un arrays donde se guarde el nombre, apellidos y edad de 5
		// personas.
		// Leera los datos desde el teclado
		// Mostrará los datos por pantalla
		// Calcular la edad media de las 5 personas del array.
		// Encontrar la edad mínima y máxima.
		Scanner teclado = new Scanner(System.in);
		String[][] personas = new String[5][3];
		int media= 0;
		int tot=0;
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Introduzca nombre: ");
			personas[i][0] = teclado.nextLine();
			System.out.println("Introduzca apellidos: ");
			personas[i][1] = teclado.nextLine();
			System.out.println("Introduzca edad: ");
			personas[i][2] = teclado.nextLine();

		}
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Nombres y apellidos: " + personas[i][0] +" "+ personas[i][1] + " Edad: " + personas[i][2]);
		}
	
		tot = tot + Integer.parseInt(personas[0][2])/personas.length;
		tot = media/personas.length;
		
		
		
		
		teclado.close();
	}

}
