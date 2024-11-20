
/**
 * 
 * @author Ramón
 *
 */

// Esto es un array bidimencional.
public class Arrays14 {

	public static void main(String[] args) {
		// Esta tabla muestra los nombres y precios de cuatro artículos de unos
		// grandes almacenes:
		// Guarda la información en un array llamado precios. Después, muestra
		// esta información en pantalla y calcula el precio total de los cuatro
		// artículos.

		int total = 0;
		String[][] precios = { { "Tablet Samsung", "120" }, { "Movil Sony", "115" }, { "iPad Mini", "290" },
				{ "Movil HTC", "95" } };
		System.out.println("      Artículos \n=====================");

		for (int i = 0; i < precios.length; i++) {
			System.out.print(precios[i][0] + "\t");
			System.out.print(precios[i][1]);
			System.out.println(" €");
		}
		;

		for (int j = 0; j < precios.length; j++) {
			total = Integer.parseInt(precios[j][1]) + total;
		}

		System.out.println("Total = " + total + " €");
	}

}
