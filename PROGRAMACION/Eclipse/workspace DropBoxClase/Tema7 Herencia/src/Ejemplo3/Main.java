package Ejemplo3;

public class Main {

	public static void main(String[] args) {
		//
		Circulo c = new Circulo();

		Figura2D unaFigura; // En esta variable podremos colocar un objeto cuya
							// clase implemente la interfaz Figura2D.
		
		//	unaFigura = new Circulo();
		//	unaFigura = new Rombo();
		//	unaFigura = new Cuadrado();
		
		// ((Cuadrado)unaFigura).mostrar();
		
		unaFigura = new Circulo();
		((Cuadrado)unaFigura).mostrar();
		
		// Pruebas usando una interfaz para almacenar constantes.
		int diaCita;
		diaCita = DiasSemana.MARTES;
		
		
	}

}
