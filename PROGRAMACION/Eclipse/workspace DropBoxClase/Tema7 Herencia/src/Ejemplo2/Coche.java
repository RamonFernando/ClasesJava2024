package Ejemplo2;

public class Coche extends Vehiculo {
		
	private int numPuertas;

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public String Mostrar(){
		return super.Mostrar() + " Tiene: " + numPuertas + " ruedas.";
	}


}
