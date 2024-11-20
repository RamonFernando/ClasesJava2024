
/**
 * 
 * @author Ramón
 *
 */
import java.util.Scanner;

public class EjemploArraysBidimencionales1 {

	public static void main(String[] args) {
		// Programa que lea el dia y la temperatura media de 7 dias de un mes y
		// luego devuelva el numero temperaturas que han pasado de 20ºc
		Scanner entrada = new Scanner(System.in);
		String[][] temp = { { "lunes", "32" }, { "martes", "34" }, { "miercoles", "21" }, { "jueves", "21" },
				{ "viernes", "18" }, { "sabado", "16" }, { "domingo", "18" } };
		int total = 0;
		String k="" ;
		System.out.println("Temperaturas y días de la semana \n================================");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i][0] + "    \t");
			System.out.println(temp[i][1]);
			
			total = Integer.parseInt(temp[i][1]) + total;
			if (Integer.parseInt(temp[i][1]) > 20) {
				k=k + " " + temp[i][1] + ", ";
			}
		}
		System.out.println("\nTemperaturas \n============");
		System.out.println("Temperatura: " + k + "\n");
		System.out.println("Media de Temperatura \n====================");
		System.out.println( "Media:  " + total/7);
		
		entrada.close();
	}

}
