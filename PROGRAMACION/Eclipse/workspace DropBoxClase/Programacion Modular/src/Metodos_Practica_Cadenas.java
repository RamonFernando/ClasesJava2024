/**
 * 
 * @author Ramon.
 *
 */
public class Metodos_Practica_Cadenas {

	public static void main(String[] args) {
		// Ejemplo del metodo length()
		String miPalabra = "Ordenador";
		System.out.println("El numero de caracteres de la palabra " + miPalabra + " es " + miPalabra.length());

		//Metodo carAt
		System.out.println("En la posicion 6 de " + miPalabra + " es: " + miPalabra.charAt(6));
		
		//Metodo replace
		System.out.println("El caracter antiguo es" + " Or " + "y el nuevo es " + " Er " + 
		miPalabra.replace(" Or ", " Er "));
	}

}
