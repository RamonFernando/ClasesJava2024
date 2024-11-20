
public class Arrays_Bi14 {

	public static void main(String[] args) {
		// 14.- Esta tabla muestra los nombres y precios de cuatro artículos de
		// unos grandes almacenes:
		// Guarda la información en un array llamado precios. Después, muestra
		// esta información en pantalla y calcula el precio total de los cuatro
		// artículos.
		
		// String precios [][] ={"Tablet Samsung", "120",}
		String precios[][] = new String[4][2];

		precios[0][0] = "tablet Samsung";
		precios[1][0] = "Movil sony";
		precios[2][0] = "Ipad Mini";
		precios[3][0] = "Movil HTC";
		precios[0][1] = "120";
		precios[1][1] = "115";
		precios[2][1] = "290";
		precios[3][1] = "95";
		
		int suma=0; 
		
		for (int i = 0; i < precios.length; i++) {
				System.out.print(precios[i][0] + " ");
				System.out.println( precios[i][1]);
		}
		for (int i = 0; i < precios.length; i++) {
			suma=suma + Integer.parseInt(precios[i][1]); 
			
		}
		System.out.println("Precio Total: " + suma);
		}
	
}
