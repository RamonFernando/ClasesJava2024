import javax.swing.plaf.synth.SynthScrollBarUI;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class BusquedaBinaria {

	public static void main(String[] args) {
		int numeros[] = { 2, 4, 5, 233, 600 };

		System.out.println(busqueda(numeros, 100));
		System.out.println(busquedaSecuencial(numeros, 5));

		int numerodos[] = new int[10];
		for (int i = 0; i < numerodos.length; i++) {
			numerodos[i] = 100 + i;
		}
		long tiempoInicial= System.currentTimeMillis();
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
