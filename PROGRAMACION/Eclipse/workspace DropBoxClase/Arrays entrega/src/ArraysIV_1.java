
import java.util.Scanner;

/**
 * 
 * @author Ramon.
 *
 */
public class ArraysIV_1 {

	public static void main(String[] args) {
		// 1.- En una biblioteca pública necesitan un programa para ir
		// rellenando las fichas de los libros. Los
		// datos a guardar de cada libro son: ISBN, título, autor y editorial.
		// Crea un programa que pida por consola 5 registros con los datos
		// anteriores y los guarde en un array
		// llamado libros. Después de introducidos, deberá listar en pantalla
		// los datos con el formato:

		Scanner teclado = new Scanner(System.in);

		String libros[][] = new String[4][5];

		for (int i = 0; i < libros.length; i++) {
			System.out.println("ISBN del libro " + i);
			libros[i][0] = teclado.nextLine();

			System.out.println("Titulo del libro " + i);
			libros[i][1] = teclado.nextLine();

			System.out.println("Autor del libro " + i);
			libros[i][2] = teclado.nextLine();

			System.out.println("Editorial del libro " + i);
			libros[i][3] = teclado.nextLine();
		}
		teclado.close();
		System.out.println("ISBN   Titulo    Autor   Editorial" 
				+ "\n=======================================");
		for (int i = 0; i < libros.length; i++) {
			System.out.println(libros[0][i] + "  " + libros[1][i] + "  " 
					+ libros[2][i] + "  " + libros[3][i]
					+ "\n======================================= ");

		}

	}

}