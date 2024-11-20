package Herencia;

public class Cliente extends Persona {

	private String visa;

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

	
	public void mostrar() {
		super.mostrar();
		System.out.println("Visa: " + visa);
	}

}