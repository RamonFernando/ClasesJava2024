/**
 * 
 * @author Ramón
 *
 */
public class Arrays5 {

	public static void main(String[] args) {
		// Escribe un programa que guarde las siguientes temperaturas en un
		// array y busque su máximo y mínimo. Además deberá indicar en qué
		// posición del array están ese máximo y mínimo.
		double [] temp = {15,16.1,16,15.4,15,14,10.2,11,15.5,10,10.1,9.8,9,6};
		double posMin= temp[0];
		double posMax= temp[0];
		
		for(int i = 1; i<temp.length;i++){
			
			if(temp[i]<posMin){
				posMin=temp[i];
			if(temp[i]>posMax){
				posMax=temp[i];
			
			}
			}
			
		
		}
		System.out.println("Maximo: " + posMax);
		System.out.println("Minimo. " + posMin);
	
	}

}
