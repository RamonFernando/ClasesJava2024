
/**
 * 
 * @author Ramon
 *
 */
import java.util.Scanner;

public class Repaso_Arrays_2 {

	public static void main(String[] args) {
		// Arrays del DNI
		Scanner entrada = new Scanner(System.in);

		int dni;
		int result;
		String[] A = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H",
				"L", "C", "K", "E" };
		System.out.println("Introduzca el DNI: ");
		dni = entrada.nextInt();
		result = dni % 23;
		System.out.println(dni + A[result]);
	
	entrada.close();
	}

}
