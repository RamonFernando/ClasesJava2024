package Ejemplo3;

public class Rombo extends Figura implements Mostrable,Figura2D {
	
	
	private double diagonalMayor;
	private double diagonalMenor;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return diagonalMayor*diagonalMenor/2;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		double DMa = diagonalMayor/2;
		double DMe = diagonalMenor/2;
		double lado = Math.sqrt(DMa*DMa + DMe*DMe);
		return 4* lado;

		//	double lado = Math.sqrt(Math.pow(diagonalMayor/2,2) + Math.pow(diagonalMenor/2, 2));
		//	return 4* lado ;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Rombo con diagonal mayor:" + diagonalMayor + " y Diagonal Menor: " + diagonalMenor);
	}

}
