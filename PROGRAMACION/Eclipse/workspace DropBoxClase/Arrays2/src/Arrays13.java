/**
 * 
 * @author Ramón
 *
 */
public class Arrays13 {

	public static void main(String[] args) {
		// La tabla siguiente muestra tres magnitudes meteorológicas medidas en
		// cuatro momentos del día. Guarda estos datos en un array bidimensional
		// llamado medidas.
		//A continuación muestra en la pantalla estas medidas fila a fila:
		
		String precios[][] = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "iPad Mini", "290" },
						{ "Móvil HTC", "95" } };
				System.out.println("     Articulos \n===================");
				
				int total=0;
				for (int i = 0; i < precios.length; i++) {
					System.out.print(precios[i][0] + "\t");
					System.out.println(precios[i][1] + "\t");
					
	}
				for (int j = 0; j < precios.length; j++) {
					total = total + Integer.parseInt(precios[j][1]);
				}
				
			
					System.out.println("total:" + total);
				
	
	}
}
