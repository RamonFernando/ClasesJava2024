package LeccionProfe5;

/**
 * 
 * @author Ramon.
 *
 */
public class Punto {

	// Esta es la clase Punto.

	// Atributos
	double x, y;
	String color;
	double transparencia;
	boolean visible;
	
	// Constructores
	Punto(){
		x=0;
		y=0;
		color = "azul";
		transparencia = 0.5;
		visible = true;
		
	}
	Punto(double x, double y, String color, double Transparencia, boolean visible){
		this.x = x;
		this.y = y;
		this.color = color;
		this.transparencia = transparencia;
		this.visible = visible;
	}
	
	
	Punto(double x, double y, String color){
		this(x, y, color, 1, true);
	}
	
	
	
	
	// Metodos
	void mostrar() {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("color: " + color);
		System.out.println("transparencia: " + transparencia);
		if(visible == true){
				System.out.println("Visible: Si");
			}else{
				System.out.println("Visible: No");
			}
		System.out.println("visible: " + visible);
	}
	// Metodos de acceso
	 void setX(double x){
		this.x = x;
	}
	 double getX(){
		 return x;
	 }
	 void setY(double y){
		 this.y = y;
	 }
	 double getY(){
		 return y;
	 }
}
