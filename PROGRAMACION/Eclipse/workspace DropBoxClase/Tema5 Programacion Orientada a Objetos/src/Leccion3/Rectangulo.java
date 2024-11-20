package Leccion3;

/**
 * 
 * @author Ramon.
 *
 */

public class Rectangulo {

	// Atributos

	int x, y; // Posicion del vértice superior izquierdo.
	int ancho, alto; // Ancho y alto del regtangulo (píxeles).

	//Constructor 
	Rectangulo(){
		
	}
	Rectangulo(int x, int y, int ancho, int alto){
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
	}
	Rectangulo(int x, int y, int lado){
		this(x,y,lado, lado);
	}
	
	
	// Metodos
	int area() {
		return ancho * alto;
	}

	int perimetro() {
		return (ancho + alto) * 2;
	}

	// Mostrar las coordenadas.
	void mostrar() {
		System.out.println("Coordenadas: " + " x: " + x + " y: " + y + ".");
		System.out.println("Dimensiones: " + " Ancho:" + ancho + "," + " Alto:" + alto + ".");
	}
	// Crea direccion de dx y dy.
	void mover(int dx, int dy){
		x=x+dx;
		y=y+dy;
		
		System.out.println("Las nuevas coordenadas son: " + x + " y " + y +  ".");
		
	}
	
	
	
}
