/**
 * 
 * @author Ramon.
 *
 */
public class Repaso_Aitor {

	public static void main(String[] args) {
		// Decir de la secuencia de numeros el mínimo y el máximo
		int[] num = { 120, 72, 34, 20, 180, 21 };
		int posMin = num[0];
		int posMax = num[0];
		

		for (int i = 0; i < num.length; i++) {
			if (num[i] < posMin) {
				posMin = num[i];

				for (int j = 0; j < num.length; j++) {
					if (num[j] > posMax) {
						posMax = num[j];
					}
				}
			}
		}
		System.out.println("Posicion minima: " + posMin);
		System.out.println("Posicion máxima: " + posMax);
	
//		double [] edades = {67.5,19.6,18,32.4,28.7,22.6,17.9};
//		int posMin = 0;
//		int posMax = 0;
//		double suma;
//		double total;
//		
//		for(int i = 0; i<edades.length;i++){
//			if(edades[i]<edades[posMin]){
//				posMin = i;
//			if(edades[i]>edades[posMax]){
//				posMax = i;
//			}
//			}
//		}
//		System.out.println(edades[posMin]);
//		System.out.println(edades[posMax]);
	
	}

}
