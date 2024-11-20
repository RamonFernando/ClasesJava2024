package Leccion2;
/**
 * 
 * @author Ramon.
 *
 */
public class Main_Punto {

	public static void main(String[] args) {
		// 
		
		Punto p = new Punto();
		
		p.x = 50;
		p.y = 100;
		p.color = "Rojo";
		p.transparencia = 0.5;
		p.visible = true;
		
		p.mostrar();
		
		Punto p1 = new Punto(50, 50, "Rojo", 0.75, true);
		Punto p2 = new Punto(10,10, "verde");
		
		p2.mostrar();
		

		
	}
}
