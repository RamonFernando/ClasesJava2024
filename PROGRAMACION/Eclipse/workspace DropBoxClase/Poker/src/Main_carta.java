
public class Main_carta {

	public static void main(String[] args) {
		// Main carta

		// Se inicializa el objeto
		Carta carta1 = new Carta(1, 0);
		Carta carta2 = new Carta(2, 1);

		System.out.println(carta1.compara(carta2));

		// El metodo toString nos permite mostrar la informacion 
		// completa de un objeto, es decir,
		//  el valor de sus atributos
		System.out.println(carta1.toString());
		System.out.println(carta2.toString());
		
		// Proyecto 6.
		// Se crea el objeto "miBaraja"
		Baraja miBaraja = new Baraja();
	
		// Se crea el metodo mostrar para mostrar "miBaraja"
		miBaraja.mostrar();
	
		
	}

}
