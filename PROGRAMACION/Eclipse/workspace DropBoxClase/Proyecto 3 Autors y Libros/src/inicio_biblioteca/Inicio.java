package inicio_biblioteca;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Autor[] autores = new Autor[10];
		int cont = 0;
		
		String opcion = " ";
		do
		{
			String nombre = "";
			System.out.println("Introduzca el nombre del autor: ");
			nombre = entrada.nextLine();
			
			Autor a1 = new Autor(nombre);
			System.out.println("Introduzca el email del autor: ");
			a1.setEmail(entrada.nextLine());
			System.out.println("Introduzca la fecha de nacimiento del autor: ");
			a1.setFechaNacimiento(Integer.parseInt(entrada.nextLine()));
			
			autores[cont++] = a1;
			
			System.out.println("Presione x para dejar de entrar datos de autores.");
			opcion = entrada.nextLine();
			
		} while(!opcion.equalsIgnoreCase("x") && cont < autores.length);

		System.out.println("Introduzca el Titulo del libro: ");
		String title = entrada.nextLine();
		
		Libro l1 = new Libro(title);
		
		System.out.println("Introduzca el ISBN: ");
		l1.setIsbn(entrada.nextLine());
		
		System.out.println("Introduzca año del Libro: ");
		l1.setAnyoActual(Integer.parseInt(entrada.nextLine()));
		
		//asignar autores a libro
		l1.setAutor(autores);
		
		System.out.println(l1.toString());
		l1.muestraAutores();
		
		entrada.close();
	}

}
