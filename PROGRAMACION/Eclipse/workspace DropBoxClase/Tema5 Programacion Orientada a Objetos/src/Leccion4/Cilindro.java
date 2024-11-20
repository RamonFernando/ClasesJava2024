package Leccion4;

/**
 * 
 * @author Ramon.
 *
 */
public class Cilindro {

	// Crear clases (Altura, Radio, PI, volumen, mostrar )
	// Calcular el area el volumen y mostrar todos los valores.

	// Atributos.

	double altura;
	double radio;
	double numPI = 3.14;

	// Metodos

	double area() {
		// (2pi*r*h)+2*pi*r²
		double a;
		a = (2 * numPI * radio * altura) + 2 * numPI * radio * 2;

		return a;

	}

	double volumen() {
		// pi*r²*h
		double v;
		v = (numPI * radio * 2) * altura;
		
		return v;
	}

	void mostrar() {
		System.out.println("La altura es: " + altura);
		System.out.println("El radio es: " + radio);
	}

}
