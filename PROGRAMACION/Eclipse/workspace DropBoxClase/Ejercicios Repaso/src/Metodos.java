/**
 * 
 * @author Ramón.
 *
 */
public class Metodos {

	public static void main(String[] args) {
		// Ejemplo del metodo legth()
		String miPalabra = "Ordenador";
		
		System.out.println("El numero de caracteres de la palabra miPalabra es " +  miPalabra + miPalabra.length());
		
		// Metodo carAt
		System.out.println("En la posicion 6 de " + miPalabra + " es " + miPalabra.charAt(6));
		
		// Metodo replace
		System.out.println("El caracter es " + " Or" + "y el nuevo es " + " Er " + miPalabra.replace("Or", "Er"));
		
		// Metodo indexOf()
		System.out.println("El caracter es " + miPalabra.indexOf("n"));
		
		// Metodo lastIndexOf()
		System.out.println("El caracter es " + miPalabra.lastIndexOf("a"));

		//Metodo compareTo()
		System.out.println("Comparacion " + miPalabra.compareTo("Ordenador" + "Hola"));
		
		// Metodo substring()
		System.out.println("Palabra " + miPalabra.substring(0,9));
		
		// Metodo  split()  Carlos este metodo no me ha salido, ya que no supe como hacerlo... 
		System.out.println("Palabra" + miPalabra.split("  "));
		
		// Metodo String.valueOf(valor)
		System.out.println("Palabra " + String.valueOf(false));
		
		//Metodo Integer.parseInt()
		System.out.println("Palabra " + Integer.parseInt("8"));
	}

}
