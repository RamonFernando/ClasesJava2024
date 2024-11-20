package Condicionales_Ejercicios_echos_por_mi;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// 5.- Crea un programa que pregunte un número de mes. Si el número
		// introducido está entre 1 y 12, mostrará un mensaje de aceptación:
		// "Mes correcto". De lo contrario, se mostrará un mensaje de error:
		// "Mes no válido".
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduzca un numero de mes: ");
		int num= entrada.nextInt();
		
		if (num > 0 && num < 13){
			System.out.println("Mes correcto");		
			}else{
				System.out.println("Error" + " mes " + num +" no valido");
			}
	
	
	entrada.close();
	}

}
