package EntregaED_Debuggin;

public class EntregaED {
	// El debuggin sirve para poder recorrer el codigo paso a paso, ver las
	// variables de nuestro codigo, ver de que manera se esta comportando el
	// programa que estamos programando y nos ayuda a encontrar distintos
	// errores que podemos hacer en el momento de programar. Para ejecutar el
	// debuggin lo primero que tenemos que hacer es ejecutar un lugar donde
	// quiero que se pare el debugguin para ver en que estado esta.
	// Para llamar o ejecutar un debuggin lo primero que hay que hacer es
	// ejecutar un lugar donde yo quiero que el programa pare para ver en que
	// estado esta,por ejemplo para ver como se ejecuta el for click derecho
	// ejecutamos el boton toggle breakpoint y ejecuto el boton debug el cual
	// esta en la parte superior de la pantalla al lado del boton verde play en
	// cuanto ejecutemos nuestra interfaz va a cambiar a otra que nos ayude a
	// ejecutar los errores, en el debuggin tenemos algunos botones claves que
	// son el Resumen(F8), el Terminate (Ctrl + F2), Step Into(F5) y el Step
	// Over(F6),
	// El play ejecuta el codigo hasta que encuentre otro breakpoint
	// Step Into es para introducirnos dentro de un metodo o saltar a la
	// siguiente instruccion,
	// Step Over es para ir a la siguiente linea
	// En el debugin tambien se puede hacer la inspeccion de valores por ejemplo
	// en un boleano se puede inspeccionar señalandolo y dandole al boton
	// derecho y buscar inspect

	public static void main(String[] args) {
		int numeros[] = { 2, 4, 5, 233, 600 };

		System.out.println(busqueda(numeros, 100));
		System.out.println(busquedaSecuencial(numeros, 5));

		int numerodos[] = new int[10000000];
		for (int i = 0; i < numerodos.length; i++) {
			numerodos[i] = 100 + i;
		}
		long tiempoInicial = System.currentTimeMillis();
		busquedaSecuencial(numerodos, 8000000);
		long tiempoTranscurrido = System.currentTimeMillis() - tiempoInicial;
		System.out.println("Tiempo Transcurrido: " + tiempoTranscurrido + " en milisegundos.");
	}

	public static int busqueda(int lista[], int num) {

		int i = 0, f = lista.length, m; // Posiciones inicial, media y media en
										// el array.

		while (i <= f) {
			m = (i + f) / 2;
			if (lista[m] == num) {
				return m; // Por que el numero esta en la posicion m
			} else if (lista[m] > num) {
				f = m - 1;
			} else {
				i = m + 1;
			}
		}
		return -1;
	}
	// Metodo que se llame busqueda secuencial y que recorra el array desde la
	// posicion 0 y que pare cuando encuentre el elemento o que llegue al final
	// del array.

	public static int busquedaSecuencial(int lista[], int num) {

		for (int i = 0; i < lista.length; i++) {// Para buscar en el array
			if (lista[i] == num) {// Si los numeros[i] es igual a num devolvera
									// la posicion de i su no un -1.
				return i;
			}
		}
		return -1;
	}

}
