package Biblioteca;

public class Libro {

	// Atributos
	private String titulo;
	private String ISBN;
	private Autor autor;
	private int añoActual;

	public Libro(String titulo) {

	}

	public Libro(String titulo, String ISBN, Autor autor) {
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.autor = autor;
	}

	public static int añoActual() {
		return 2016;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public Autor getautor() {
		return autor;
	}

	public void  setautor(Autor autor){
	 	this.autor = autor;
	}
	public int getañoActual(){
		return añoActual;
	}
	public void setañoActual(int añoActual){
		this.añoActual = añoActual;
	}
	public String toString(){
		return "";
	}
}