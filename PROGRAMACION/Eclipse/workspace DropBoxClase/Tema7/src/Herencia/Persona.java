package Herencia;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;

	public void mostrar() {
		System.out.println("Dni: " + dni + ", Nombre: " + nombre 
				+ ", Apellidos: " + apellidos);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
}
