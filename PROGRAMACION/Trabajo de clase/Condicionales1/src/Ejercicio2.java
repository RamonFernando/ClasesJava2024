import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int temperatura;
		System.out.println("Por favor introduzca la tempratura del reactor.");
		temperatura = teclado.nextInt();
		if (temperatura > 120) {

			System.out.println("Temperatura del reactor crítica !!");
			System.out.println("corred insensatos");
			teclado.close();

		}

	}

}
