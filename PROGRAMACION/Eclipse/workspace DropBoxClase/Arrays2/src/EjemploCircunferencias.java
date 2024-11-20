import java.util.Scanner;

public class EjemploCircunferencias {

	public static void main(String[] args) {
		// Calcular perimetro y area de una circunferencia.

		Scanner entrada = new Scanner(System.in);
		double radio;
		double area;
		
		System.out.println("Introduzca el radio: ");

		radio = entrada.nextDouble();
		System.out.println(perimetroCircunferencia(radio));

		System.out.println();
		area = entrada.nextDouble();
	}

	static double perimetroCircunferencia(double radio) {
		double pi = Math.PI;
		double perimetro;
		perimetro = radio * 2 * pi;
		return perimetro;

	}

	static double areaCircunferencia(double radio) {
		double pi = Math.PI;

		double area;
		area = pi * (radio * radio);
		return area;

	}
}
