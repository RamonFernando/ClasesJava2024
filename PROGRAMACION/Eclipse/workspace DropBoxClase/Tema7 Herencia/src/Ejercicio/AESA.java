package Ejercicio;

public abstract class AESA {
	
	// Clase madre que Hereda a objet y de esta heredan Airberlin, Iberia y
	// Aireuropa.
	
	private String marca;
	private String motor;
	private String tipoAvion;
	private String clases;
	
	public void mostrar(){
		System.out.println("Marca: " + marca + "Motor: " + motor + "Tipos de Avion: " 
				+ tipoAvion + "Clases de vuelo: " + clases);
	}
	public abstract void volar();
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getTipoAvion() {
		return tipoAvion;
	}
	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}
	public String getClases() {
		return clases;
	}
	public void setClases(String clases) {
		this.clases = clases;
	}
	
	
	
}
