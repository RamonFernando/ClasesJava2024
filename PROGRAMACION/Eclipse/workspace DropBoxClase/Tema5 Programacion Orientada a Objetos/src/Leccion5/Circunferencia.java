package Leccion5;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Circunferencia {

	// Constructor
	double x, y;
	double radio;
	private static int contador;

	// Construcctores

	Circunferencia() {
		x = 6;
		y = 4;
		radio = 3;
		contador++;

	}

	Circunferencia(double x, double y, double radio) {
		this.x = 6;
		this.y = 4;
		this.radio = 3;
		contador++;

	}

	Circunferencia(double x, double y) {
		this(x, y, 10);
	}

}
