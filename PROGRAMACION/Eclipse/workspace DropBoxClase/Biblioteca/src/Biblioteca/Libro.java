package Biblioteca;

public class Libro {

	// Atributos
	private String titulo;
	private String isbn;
	private Autor autor;
	private static int anyoActual;

	// Constructores
	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, Autor autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}
	
	public Libro(){
		
	}

	// Métodos
	public String toString() {
		String resumen = "Libro: Título = " + titulo + "; ISBN = " + isbn 
				+ "; Autor: " + autor.getNombre();
		return resumen;
	}

	// Métodos de acceso
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public static int getAnyoActual() {
		return anyoActual;
	}

	public static void setAnyoActual(int anyoActual) {
		Libro.anyoActual = anyoActual;
	}

}
