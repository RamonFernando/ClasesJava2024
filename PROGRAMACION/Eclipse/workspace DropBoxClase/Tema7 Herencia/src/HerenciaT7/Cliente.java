package HerenciaT7;

public class Cliente extends Persona {
	private String visa;

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}
	public void mostrar(){
		System.out.println("DNI: " + getDni() + "Nombre: " + getNombre() + "Apellidos: " + getApellidos() + "Visa: " + getVisa() +  ".");
	}
	public void saludar(){
		System.out.println("Hola");
	}

	@Override
	public void darDeAlta() {
		
		
	}
}

	