/**
 * 
 * @author Ramon.
 *
 */
package Condicionales_Ejercicios_echos_por_mi;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// 22.- Crea un programa que calcule la hora de cierre de una tienda.
		// Esta hora depende del valor de una variable de tipo String llamada
		// dia. Si su valor es "entre semana", la hora de cierre de la tienda
		// será "20:00". En otro caso, la hora de cierre será "14:00".
		Scanner entrada = new Scanner(System.in);

		String dia;
		String opc;
		

		System.out.println("Introduzcala opcion 'no' para dias entre semana o la opcion 'si' si es fin de semana");
		dia = entrada.nextLine();
		opc = dia;

		if (opc.equals("si")) {
			System.out.println("Hora de cierre 14:00 horas");
		}
		if (opc.equals("no")) {
			System.out.println("Hora de cierre 20:00 horas");
		}

		entrada.close();
	}

}
