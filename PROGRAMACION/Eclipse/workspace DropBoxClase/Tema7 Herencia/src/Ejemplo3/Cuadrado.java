package Ejemplo3;

public class Cuadrado extends Figura implements Mostrable, Figura2D{
	
	private double lado;
	
	@Override
	public double area() {
		
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Cuadrado de lado: " + lado);
	}

}
