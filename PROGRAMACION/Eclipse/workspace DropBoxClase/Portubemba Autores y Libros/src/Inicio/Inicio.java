package Inicio;

import org.omg.Messaging.SyncScopeHelper;

import Biblioteca.Autor;
import Biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {
		// Esta es la clase main de tubemba
		
		Autor autor = new Autor("Pepe","pepe@hotmail.es", "04-06-1988");
		
		Libro libro = new Libro("El armagedon","12345",autor);
		
		
		System.out.println(autor.toString());
	}
		
}
