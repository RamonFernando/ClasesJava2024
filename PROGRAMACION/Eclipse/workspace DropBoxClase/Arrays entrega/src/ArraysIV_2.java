/**
 * 
 * @author Ramon.
 *
 */
public class ArraysIV_2 {

	public static void main(String[] args) {
		// 2.- A lo largo de diez días los valores de las acciones de Microsoft
		// al cierre del mercado han sido:
		// Diseña un programa que calcule el mínimo y el máximo de los valores
		// mencionados. Utiliza un
		// array de nombre cotizaciones. Introduce los datos directamente en el
		// código del programa.

		double cotizaciones[] = { 47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 49.9, 48.05, 48.7 };
	  double posMin = cotizaciones[0];
	  double posMax = cotizaciones[0];
	  
	  for (int i = 0; i < cotizaciones.length; i++) {
	   if (posMin > cotizaciones[i]) {
	    posMin = cotizaciones[i];
	   }
	   if (posMax < cotizaciones[i]) {
	    posMax = cotizaciones[i];
	   }
	  }
	  System.out.println("Posicion Minima:" + posMin);
	  System.out.println("Posicion Maxima: " + posMax);
	 }

	}