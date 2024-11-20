package Condicionales_Ejercicios_echos_por_mi;

import java.util.Scanner;

/**
 * 
 * @author Ramon
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// 3.- Modifica el ejercicio anterior de manera que si la compra es
		// inferior a 5 €, se sumen 2 euros a la factura por gastos de gestión.
		Scanner entrada = new Scanner(System.in);
		double precio;
		double descuento;
		double resultado;
		
		
		
		System.out.println("Introduzca precio: ");
		precio = entrada.nextDouble();
		descuento = precio*0.10;
		resultado = precio + 2;
		
		if(precio > 80 ){
			System.out.println("Su descuento es: " + descuento + " €");
			System.out.println("Gracias por su compra.");
			
			
		}
		if (precio < 5){
			System.out.println(" Usted tiene un regalo de 2 Euros " + resultado + " €");
			System.out.println("Gracias por su compra.");
		}
		if ( precio > 5 && precio < 80  ){
			System.out.println("Gracias por su compra.");
		
	}
	entrada.close();
	}
}
