import java.util.Scanner;

public class Entrada {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantos años tienes?");
		
		//programa recoge la entrada del usuario
		
		byte edad;
		edad = teclado.nextByte();
		System.out.println("No aparece que tengas " + edad + "años");
		
		//Ejercicio lo mismo pero preguntale el nombre y responda hola con el nombre
		
		
	System.out.println("Hola, Como te llamas");
	String nombre;
	teclado.hasNext();
	nombre = teclado.nextLine();
	System.out.println("Hola," + nombre);
	teclado.close();
	
	
	
	
	
	}

}
