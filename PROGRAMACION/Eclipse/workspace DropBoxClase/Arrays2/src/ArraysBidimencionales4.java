
/**
 * 
 * @author Ramon
 *
 */
import java.util.Scanner;

public class ArraysBidimencionales4 {

	public static void main(String[] args) {
		// Programa que guarde en un Arrays la lista de meses del año y el
		// número de dias que tienen (considerando que febrero tiene 28
		// dias).Despues se pedira al usuario que escriba el nombre de un mes y
		// el programa le responda con el nombre dias que tiene ese mes,
		// utilizando la tabla.
		Scanner entrada = new Scanner(System.in);
		String[][] meses = { { "enero", "31" }, { "febrero", "28" }, { "marzo", "31" }, { "abril", "30" },
				{ "mayo", "31" }, { "junio", "30" }, { "julio", "31" }, { "agosto", "31" }, { "septiembre","30" }, { "octubre","31" }, { "noviembre","30" },
				{ "diciembre","31" }};
		
		for(int i = 0; i<meses.length;i++){
		System.out.println("Escribe el nombre de un mes: ");
		String respuesta= entrada.nextLine();
		
		if(respuesta.equals(meses[i][0])){
			System.out.println("El mes: " +  respuesta + " tiene " + meses[i][1] + "dias.");
		}
		}
		

		entrada.close();
	}

}
