package Condicionales_Ejercicios_echos_por_mi;

import java.util.Scanner;
/**
 * 
 * @author Ramon.
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// 2.- Escribe un programa que pregunte el precio de un producto. Si
		// vale más de 80 €, le hará un descuento del 10%. Se mostrará en
		// pantalla el precio final.
		
		double precio;
		double descuento;
		
		
		
		System.out.println("Introduzca precio: ");
		precio = entrada.nextDouble();
		descuento = precio*0.10;
		
		if(precio>= 80){
			System.out.println("Su descuento es: " + descuento + " €");
			System.out.println("Gracias por su compra.");
		}else{
			System.out.println("Gracias por su compra.");
		
	}

	
		entrada.close();
	}

}
