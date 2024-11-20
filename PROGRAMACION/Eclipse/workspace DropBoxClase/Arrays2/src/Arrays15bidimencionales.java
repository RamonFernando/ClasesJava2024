/**
 * 
 * @author Ramón
 *
 */

public class Arrays15bidimencionales {

	public static void main(String[] args) {
		// Añade al programa anterior otro bucle que recorra el array y
		// encuentre el menor y el mayor precio.

		String precios[][] = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "iPad Mini", "290" },
				{ "Móvil HTC", "95" } };
		System.out.println("     Articulos \n===================");
		
		float total=0;
		
		for (int i = 0; i < precios.length; i++) {
			System.out.print(precios[i][0] + "\t");
			System.out.println(precios[i][1] + "\t");
		}
		for(int j=0;j<precios.length;j++){
			
			total=Float.parseFloat(precios[j][1]) + total;
			
			
		}
		System.out.println("total = " + total);
		
		
		
		
	}

}
