package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor[] autores;
	private int anyoActual = 2016;

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, Autor[] autores) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	}

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

	public Autor[] getAutor() {
		return autores;
	}

	public void setAutor(Autor[] autores) {
		this.autores = autores;
	}

	public int getAnyoActual() {
		return anyoActual;
	}

	public void setAnyoActual(int anyoActual) {
		this.anyoActual = anyoActual;
	}
	
	//(autores.length > 1 ? "Varios autores" : autores[0].getNombre())
	// condicion == true ? esto : esto otro
	//if(autores.length > 1) varios else autores[0].nombre
	//autores.length devuelve el numero de objetos dentro del array
	public String toString(){
		return "Titulo: " + titulo + " ISBN: " + isbn 
				+ " Autor: " + (autores.length > 1 ? "Varios autores " : autores[0].getNombre())
				+ " AnyoActual: " 
				+ anyoActual;
	}
	
	public void muestraAutores(){
		for (int i = 0; i < autores.length; i++) {
			if(autores[i] != null)
				System.out.println("Autor: " + autores[i].getNombre());
		}
	}
}
