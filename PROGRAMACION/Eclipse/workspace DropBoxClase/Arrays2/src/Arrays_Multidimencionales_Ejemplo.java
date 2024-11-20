/**
 * 
 * @author Ramon
 *
 */
public class Arrays_Multidimencionales_Ejemplo {

	public static void main(String[] args) {
		// Arrays multidimencionales

		// String[][][] palabra = new String[10][5][3];
		// Edificio que tiene 5 filas de 3 habitaciones cada una, y 4 plantas.
		double[][][] iluminacion = new double[5][3][4];
		
		
		iluminacion[0][0][0] = 5.5; 
		iluminacion[1][0][0] = 7.2;
		iluminacion[2][0][0] = 4.2;
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
					System.out.println("Iluminacion en el despacho " + i + ", " + j + ", " + k + ", " + " = "
							+ iluminacion[i][j][k]);
				}
			}

		}

		
	}

}
