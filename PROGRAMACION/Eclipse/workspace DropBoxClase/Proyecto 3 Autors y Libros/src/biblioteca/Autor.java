package biblioteca;

public class Autor {

	// Atributos // Modificadores (private, public)
	private String nombre;
	private String email;
	private int fechaNacimiento;

	
	// Constructor
	public Autor(String nombre, String email, int fechaNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;

	}
	
	public Autor(String nombre) {
		this.nombre = nombre;
		
		this.email = "Unknown";
		this.fechaNacimiento = 0;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getEmail(){
		return email;
	}
	// Void es para decir que metodo no retorna nada.
	public void setEmail(String email ){
		this.email= email;
	}
	public int getFechaNacimiento(){
		return fechaNacimiento;
	}
	public void setFechaNacimiento(int fechaNacimiento){
		this.fechaNacimiento=fechaNacimiento;
	}
	
	public String toString(){
		return "Autor: " + nombre + " Email: " + email + " Fecha/N: " + fechaNacimiento; 
	}

}
