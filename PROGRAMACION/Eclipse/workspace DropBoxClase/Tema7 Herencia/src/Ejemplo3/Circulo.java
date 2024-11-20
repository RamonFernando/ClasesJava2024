package Ejemplo3;

public class Circulo extends Figura implements Mostrable, Figura2D {
	// extends significa que es una clase hija o heredada de otra clase.
	// Area del circulo PIxRadio^2
	// Perimetro 2*PI*radio.
	
	// Ejercicio:
	// Crear una clase cuadrado que herede de figura e implemente Mostrable y figura 2D.
	
	private double radio;
	
	
	@Override
	public void mostrar() {
				System.out.println("Radio: " + radio);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radio*radio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radio;
	}

}
