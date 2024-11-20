/**
 * 
 * @author Ramón.
 *
 */

public class EjemploMin_Max_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] precios = {120,115,290,95};
		int posMin = 0;
		for (int i = 1; i<precios.length;i++){
			if(precios[i]<precios[posMin]){
			posMin=i;
			}
		}
		System.out.println("El menor elemento es " + precios[posMin] +
		" y está en la posición " + posMin);
	}

}
