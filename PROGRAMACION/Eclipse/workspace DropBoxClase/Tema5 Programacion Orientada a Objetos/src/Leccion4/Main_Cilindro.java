package Leccion4;

public class Main_Cilindro {

	public static void main(String[] args) {
		// Crear clases de un cilindro.

	Cilindro C1= new Cilindro();
	
	C1.altura=5;
	C1.numPI=3.14;
	C1.radio=3;
	
	
	System.out.println("El area vale: " +  C1.area());
	System.out.println("El volumen vale: " + C1.volumen());
	C1.mostrar();
	
	
	
	}

}
