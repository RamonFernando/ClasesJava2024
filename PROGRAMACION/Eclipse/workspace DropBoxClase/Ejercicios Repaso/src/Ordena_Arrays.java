
public class Ordena_Arrays {

	public static void main(String[] args) {
		// // Tenemos un arrays de 7 posiciones con numeros double queremos saber
		// cual es el numero mas pequeño, el numero mas grande y la media y
		// finalmente lo organizamos.
		
		double[] numeros = { 67.5, 19.6, 18, 32.4, 28.7, 22.6, 17.9 };
		
		int posMin=0;
		int posMax=0;
		double media = 0; 
		double aux = 0;
		int suma;
		
		for (int i = 1; i < numeros.length; i++) {
			if(numeros[i] < numeros[posMin])
				posMin = i;
			if(numeros[i] > numeros[posMax])
				posMax = i;
	    }
		
		for (int i = 0; i < numeros.length; i++) {
			aux = aux + numeros[i];
		}
		media = aux/numeros.length;
		
		for (int j = 0; j < numeros.length; j++) {
			for (int k = 0; k < numeros.length-1; k++) {
				if (numeros[k] > numeros[k+1]){
					aux = numeros[k];
					numeros [k] = numeros[k+1];
					numeros[k+1] = aux;
				}
			}
		}
		
		System.out.println("min: "+ numeros[posMin] + " max: "+ numeros[posMax]);
		System.out.println("media: " + media);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(" ordenados: " + numeros[i]);
		}
		

	}

}
