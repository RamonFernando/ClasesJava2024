import java.util.Scanner;
public class EjemploClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner palabra = new Scanner(System.in);
		System.out.println("Introduzca precio: ");
		int precio = palabra.nextInt();
		palabra.nextLine();
		System.out.println("Introduzca nombre: ");
		String nombre=  palabra.nextLine();
		
		palabra.close();
	}

}
