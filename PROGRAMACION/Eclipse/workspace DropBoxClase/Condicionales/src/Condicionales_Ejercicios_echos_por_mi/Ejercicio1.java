package Condicionales_Ejercicios_echos_por_mi;

import java.util.Scanner;

/**
 * 
 * @author Ramon
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// 1.- Crea un programa que pida la temperatura de un reactor nuclear.
		// Si ésta supera los 120ºC, se mostrará en pantalla el mensaje:
		// "TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!
		int temperatura; 
		
		System.out.println("Introduzca la temperatura del reactor: ");
		temperatura= entrada.nextInt();
		
		if (temperatura>= 120){
			System.out.println("TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!");
		}else{
			System.out.println(temperatura + " Grados " + " Temperatura del reactor estable.");
		}
		
		entrada.close();
	}
	
}
