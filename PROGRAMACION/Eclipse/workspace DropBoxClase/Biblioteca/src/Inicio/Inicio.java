package Inicio;

import java.util.Scanner;
import Biblioteca.*;

public class Inicio {
	
	public static void main(String[] args){
		
//		Se pedirá al usuario que se introduzcan los datos de un autor: nombre, email, fecha de 
//		nacimiento, y se guardarán en un objeto de tipo Autor.
//		
//		Se pedirá al usuario que introduzca el título, ISBN y año actual de un libro. El autor será el 
//		que se ha dado de alta en el apartado anterior. Los datos del libro se guardarán en un objeto 
//		de la clase Libro.
//		
//		Se mostrarán en pantalla los datos del autor usando 
//		toString ( )
//
//		Se mostrarán en pantalla los datos del libro usando también 
//		toString ( )
		
		Scanner entrada = new Scanner(System.in);
		
		// Se pedirá al usuario que se introduzcan los datos de un autor: 
		// nombre, email, fecha de nacimiento, y se guardarán en 
		// un objeto de tipo Autor.
		System.out.print("Nombre del autor: ");
		String nombre = entrada.nextLine();
		entrada.nextLine();
		System.out.print("Email del autor: ");
		String email = entrada.nextLine();
		System.out.print("Fecha de nacimiento: ");
		String fechaNacimiento = entrada.nextLine();
		Autor unAutor = new Autor(nombre,email,fechaNacimiento);
		
		// Se pedirá al usuario que introduzca el título, ISBN y año actual 
		// de un libro. El autor será el que se ha dado de alta en el apartado 
		// anterior. Los datos del libro se guardarán en un objeto 
		// de la clase Libro.
		System.out.println("------------------------------------");
		System.out.print("Título del libro: ");
		String titulo = entrada.nextLine();
		System.out.print("ISBN: ");
		String isbn = entrada.nextLine();
		System.out.print("Año actual: ");
		String anyoActual = entrada.nextLine();
		
		Libro miLibro = new Libro(titulo,isbn,unAutor);
		
		// Se mostrarán en pantalla los datos del autor usando toString ( )
		System.out.println("------------------------------------");
		System.out.println(unAutor.toString());
		
		// Se mostrarán en pantalla los datos del libro usando también 
		// toString ( )
		System.out.println("------------------------------------");
		System.out.println(miLibro.toString());
		entrada.close();
	}
}