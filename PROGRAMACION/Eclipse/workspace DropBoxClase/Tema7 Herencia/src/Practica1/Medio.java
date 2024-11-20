package Practica1;

public abstract class Medio{

	private int id;
	private String nombre;
	private double duracion;
	
	public abstract void reproducir();
	
	public Medio(int id, String nombre, double duracion){
		
		this.id = id;
		this.nombre = nombre;
		this.duracion = duracion;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
