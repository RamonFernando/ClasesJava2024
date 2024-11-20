/**
 * 
 * @author Ramon.
 *
 */
public class Ordenar_un_Array {

	public static void main(String[] args) {
		// Tenemos un arrays de 7 posiciones con numeros double queremos saber
		// cual es el numero mas pequeño, el numero mas grande y la media y
		// finalmente lo organizamos.

		double[] edades = { 67.5, 19.6, 18, 32.4, 28.7, 22.6, 17.9 };
		int posMax = 0;
		int posMin = 0;
		double media = 0;
		double suma = 0;
		double aux;
		for (int i = 1; i < edades.length; i++) {
			if (edades[i] < edades[posMin]) {
				posMin = i;
			}

			if (edades[i] > edades[posMax]) {
				posMax = i;

			}
			for(int k =0; k<edades.length-i;k++){
				if(edades[k]>edades[k+1]){
					aux= edades[k];
					edades[k] = edades[k+1];
					edades[k+1] = aux;
				
				}
			
			}
		}
			System.out.println("Edades organizadas: \n===================");
			for (int i = 0; i < edades.length; i++) {
				
				System.out.println(edades[i]);
			}
		
		System.out.println();	
		System.out.println("Posición Mínima: " + edades[posMin]);
		System.out.println("Posición Máxima: " + edades[posMax]);

		for (int j = 0; j < edades.length; j++) {
			suma = edades[j];
			media = suma / 7;
			
		}
		System.out.println("Media de Edades: " + media);
	}

}
