
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Creamos un objeto.
	Carta objetoBaraja = new Carta(1,0);
	
	Carta objetoBaraja1 = new Carta(2,1);
		
	System.out.println(objetoBaraja.toString());		
	System.out.println(objetoBaraja1.toString());	
	
	System.out.println(objetoBaraja.compara(objetoBaraja1));
	
	//Proyecto 6 Baraja.
	
	Baraja miBaraja = new Baraja();
	
	miBaraja.mostrar();
	
	miBaraja.extraer();
	
	}

}
