package Refactorizar;

/**
 * @author Ramon
 */



public class Ejercicio9 {

	public static void main(String[] args) {
		// Crea un programa que muestre los siguientes precios (guardados en un
		// array llamado precios) ordenados de menor a mayor, usando el método
		// de selección.

		int[] valores = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };
		int posMin;
		int aux;

		for (int i = 0; i < valores.length; i++) {
			posMin = i;
			
		for(int j = i; j< valores.length; j++){
			if (valores[j]< valores[posMin]){
				posMin = j;
			}
		}
		
		aux = valores [i];
		valores [i] = valores [posMin];
		valores [posMin]= aux;
		
		for(int k = 0; k < valores.length; k++){
			System.out.println(valores[k] + " ");
		}
		System.out.println("----------");
		}
	
	}

}
