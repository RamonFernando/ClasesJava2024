import java.util.Scanner;

public class EjemploGeometria {

	public static void main(String[] args) {
		//
		Scanner entrada = new Scanner(System.in);
		double base, altura;
		System.out.println("Base de triangulo: ");
		base = entrada.nextDouble();
		System.out.println("Altura de triangulo: ");
		altura = entrada.nextDouble();

		double lado1, lado2, lado3;
		System.out.println("Lado 1 del triangulo: ");
		lado1= entrada.nextDouble();
		System.out.println("Lado 2 del triangulo: ");
		lado2= entrada.nextDouble();
		System.out.println("Lado 3 del triangulo: ");
		lado3= entrada.nextDouble();
		
		System.out.println("El perimetro del triangulo es: " + perimetroTriangulo(lado1,lado2,lado3));
		
		System.out.println("El area del triangulo es = " + areaTriangulo(base, altura));
	}

	static double areaTriangulo(double base, double altura) {
		double area;
		area = base * altura / 2;
		return area;
		
	}
	static double perimetroTriangulo(double lado1, double lado2, double lado3){
		double perimetro;
		perimetro = lado1*lado2*lado3;
		return perimetro;
	}
}