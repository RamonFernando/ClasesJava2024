package Entrega1_EjerciciosRecursivos;

public class Entrega1_EjercicioRecursivo3 {

	public static void main(String[] args) {
		// 3.- Crea una clase con un metodo transforma(int dato) que transforme
		// un
		// numero entero en base diez a hexadecimal. Utiliza un procedimiento
		// recursivo.

		System.out.println(Transforma(30));

	}

	public static String Transforma(int num) {

		if (num >= 16) {
			return Transforma(num / 16) + enLetras(num % 16);

		} else {
			return "" + enLetras(num);
		}
	}

	private static String enLetras(int num1) {
		if (num1 <= 9) {
			return "" + num1;
		}
		switch (num1) {

		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		default:
			return "F";

		}
	}

}
