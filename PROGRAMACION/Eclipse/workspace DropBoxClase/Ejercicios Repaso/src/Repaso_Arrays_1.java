/**
 * 
 * @author Ramón
 *
 */

public class Repaso_Arrays_1 {

	public static void main(String[] args) {
		// Ejercicio 
		int [] num =  {8,2,10,20,12,71,15,23};
		
		int aux;
		for(int i = 1; i<num.length;i++){
		
			for(int j = 0;j<num.length-i;j++ ){
				if (num[j]>num[j+1]){
				aux = num[j];
				num[j]= num[j+1]; 
				num[j+1]= aux;
				}
			}
		}
		for(int k =0; k<num.length;k++){
			System.out.println(num[k]);
		}
		
	}

}
