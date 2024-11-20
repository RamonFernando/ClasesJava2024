package HerenciaT7;

public  class Persona {
	private String dni;
	private String nombre;
	private String apellidos;

	public void mostrar() {
		System.out.println("DNI: " + dni + "Nombre: " + nombre + "Apellidos: " + apellidos + ".");
	}

	public void darDeAlta() {
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
	public boolean equals(Object o){
		if(!(o instanceof Persona)){
			return false;
	}
	
	
	
		Persona p = (Persona) o;
		if (dni.equals(p.getDni())){
			return true;
		}
		return false;
	}
	
}
