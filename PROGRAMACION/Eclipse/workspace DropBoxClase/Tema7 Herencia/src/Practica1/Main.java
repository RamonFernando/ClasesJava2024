package Practica1;

public class Main {

	public static void main(String[] args) {

		MP3 cancion1 = new MP3(1, "Efectos vocales", 160, "Nach", "Rap", 1);
		MP3 cancion2 = new MP3(2, "Pesadilla", 200, "La Oreja de Van Gogh", "Pop", 1);
		MP3 cancion3 = new MP3(3, "Angel", 210, "Nach", "Rap", 1);

		Biblioteca discoteca = new Biblioteca();
		
		discoteca.addSong(cancion1);
		discoteca.addSong(cancion2);
		discoteca.addSong(cancion3);
		
		discoteca.mostrar();
		System.out.println("---");
		
		discoteca.ordenar();
		discoteca.mostrar();
		System.out.println("---");
		
		discoteca.delete(1);
		discoteca.ordenar();
		discoteca.mostrar();
		
		
		
		
//		Mp3 cancion = discoteca.getSong(2);
//		System.out.println(cancion.getNombre());
//		System.out.println("---");
//		
//		discoteca.update(cancion1,2);
//		discoteca.mostrar();
//		System.out.println("---");
//		
//		discoteca.delete(1);
//		discoteca.mostrar();
//		System.out.println("---");
//		
//		discoteca.busqueda("");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}