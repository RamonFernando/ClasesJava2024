
public class Main {
	public static void main(String[] args) {

		Carta carta1 = new Carta(1, 0);
		Carta carta2 = new Carta(2, 1);

		Baraja miBaraja = new Baraja();
		
		miBaraja.mostrar();
		
		miBaraja.barajar();
		
		miBaraja.mostrar();
	}
}