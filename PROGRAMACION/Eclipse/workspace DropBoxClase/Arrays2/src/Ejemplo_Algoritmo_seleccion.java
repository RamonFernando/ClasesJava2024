
public class Ejemplo_Algoritmo_seleccion {
	public static void main(String[] args) {
		int[] valores = { 4, 9, -1, 5, 8 }; // Arrays de numeros que hay que
											// ordenar.
		int posMin;// Posicion del menor elemento del subarray
		int aux; // Variable auxiliar para intercambiar valores
		for (int i = 0; i < valores.length; i++) {

			// Buscamos la posicion del elemento mas pequeño entre i y n-1
			posMin = i;
			for (int j = i; j < valores.length; j++) {
				if (valores[j] < valores[posMin]) {
					posMin = j;

				}

			}
			// Ahora posMin es la posicion del minimo elemento del arrays entre
			// i y el final del array.

			// Intercambiamos las posiciones i y posMin.
			aux = valores[i];
			valores[i] = valores[posMin];
			valores[posMin] = aux;

			// Para hacer el algorismo iremos mostrando el array
			for (int k = 0; k < valores.length; k++) {
				System.out.println(valores[k] + " ");

			}
			System.out.println("------------");
			// Mostramos el arrays ya ordenado.

		}
	}
}
