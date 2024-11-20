package Leccion6;

public class Cuadrado {
	//Atributos.
	int x,y;
	double lado;
	
	 
	
	//Constructor
	Cuadrado(){
		
	}
	Cuadrado (int x, int y, double lado){
		this.x = x;
		this.y = y;
		this.lado = lado;
	}
	
	
	//Metodos: Perimetro, Area, Mostrar()
	double perimetro(){
		return (lado*4);
	}
	double area(){
		return(Math.pow(lado, 2));
	}
	void mostrar(){
		System.out.println("Posicion centro: " + x + "px.");
		System.out.println("Tamaño de lado: " + lado);
	}
}
