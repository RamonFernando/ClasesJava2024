/**
 * 
 * @author Ramon.
 *
 */
public class ArraysIV_4 {

	public static void main(String[] args) {
		// 4.- Diseña un programa que a partir de la siguiente tabla de
		// temperaturas, proveniente del registro
		// de un termostato, indique la posición de la primera medida menor que
		// cero.
		// En caso de que no hubiera ninguna temperatura negativa,
		// se indicaría un valor de posición de -1.
		// Scanner entrada = new Scanner(System.in);

		double termostato[] = { 3.2, 3.5, 7.2, 0.1, 1, -2.3, -5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6 };
		boolean temperatura = false;

		for (int i = 0; i < termostato.length; i++) {
			if (termostato[i] < 0) {
				System.out.println("La primera medida menor que cero del termostato es: " + termostato[i]);
				temperatura = true;
				break;
			}
		}
		if (temperatura == false) {
			System.out.println("Valor: -1");
		}
	}

}
