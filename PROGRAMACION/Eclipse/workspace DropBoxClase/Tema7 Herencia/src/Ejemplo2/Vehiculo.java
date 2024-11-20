package Ejemplo2;

public class Vehiculo {

	// Atributos
	protected String matricula;
	protected String marca;
	protected String modelo;

	// Metodos
	public String Mostrar() {
		return "Matricula: " + matricula + " Marca: " + marca + " Modelo: " + modelo;
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
