package Biblioteca;

public class Autor {

	// Atributos
	private String nombre;
	private String email;
	private String fechaNacimiento;

	// Constructores
	public Autor(String nombre) {
		this(nombre, "Unknown", "0");
	}

	public Autor(String nombre, String email, String fechaNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Métodos
	public String toString() {
		return "Autor: nombre = " + nombre + "; email = " 
				+ email + "; fecha de nacimiento = " + fechaNacimiento;
	}

	// Métodos de acceso
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
}