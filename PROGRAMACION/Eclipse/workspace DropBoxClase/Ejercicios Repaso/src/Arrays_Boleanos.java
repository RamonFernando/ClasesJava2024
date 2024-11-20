/**
 * 
 * @author Ramon.
 *
 */
import java.util.Scanner;

public class Arrays_Boleanos {

	public static void main(String[] args) {

		// Escribe un programa que lea una lista de nombres (uno a uno, hasta un
		// maximo de de 10) por consola y vaya guardando en un array llamado
		// nombres. La aplicacion terminara de pedir palabras cuando el usuario
		// escriba nadie.
		Scanner entrada = new Scanner(System.in);
		String nombres[] = new String[10];
		boolean pedir = true;

		for (int i = 0; i < nombres.length && pedir == true; i++) {
			System.out.println("Escriba su nombre: ");
			nombres[i] = entrada.nextLine();
			if (nombres[i].equals("nadie") || i == nombres.length-1) {
				pedir = false;
			}
		}
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombres: " + nombres[i]);
		}
		
		entrada.close();
	}

}
