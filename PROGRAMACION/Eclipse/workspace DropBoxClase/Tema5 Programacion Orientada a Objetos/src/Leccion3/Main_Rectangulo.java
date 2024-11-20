package Leccion3;
/**
 * 
 * @author Ramon.
 *
 */
public class Main_Rectangulo {

	public static void main(String[] args) {
		
		//
		
		Rectangulo r1= new Rectangulo();
		
		r1.x=50;
		r1.y=100;
		
		r1.ancho=200;
		r1.alto=300;
		
		System.out.println("Area: " + r1.ancho + " px² ");
		System.out.println("Perimetro: " + r1.alto + " px² ");
		
		
		r1.mostrar();
		
		r1.mover(10, 20);
		
		
		
		
	}

}
