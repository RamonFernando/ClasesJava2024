
public class Main {

	public static void main(String[] args) {
		// 
		
		Carta carta1= new Carta(2,2); 
		Carta carta2= new Carta(12,1);
		
		System.out.println(carta1.compara(carta2));
		
		System.out.println(carta1.toString());
		System.out.println(carta2.toString());
		
		// Se crea el Objeto miBaraja.
		Baraja miBaraja = new Baraja();
		
		// Se crea el metodo mostrar para miBaraja.
		
		miBaraja.mostrar();
		
		// Se crea el metodo barajar para miBaraja.
		miBaraja.barajar();
		
		miBaraja.mostrar();
	}
		
}
