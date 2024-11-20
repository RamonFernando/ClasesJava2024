package Practica1;

public class Video extends Medio {

	private String director;
	private String idioma;

	public Video(int id, String nombre, double duracion, String director, String idioma) {

		super(id, nombre, duracion);

		this.director = director;
		this.idioma = idioma;

	}

	@Override
	public void reproducir() {

		System.out.println("Reproduciendo... " + getNombre());

	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
