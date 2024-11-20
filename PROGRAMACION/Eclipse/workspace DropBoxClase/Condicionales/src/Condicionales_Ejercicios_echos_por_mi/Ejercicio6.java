package Condicionales_Ejercicios_echos_por_mi;

import java.util.Scanner;
/**
 * 
 * @author Ramon.
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// 6.- Crea una aplicación que pregunte el precio de un producto y el
		// número de unidades compradas. Si el coste de la compra es mayor de 75
		// €, se le hará un 15% de descuento. En caso contrario, se le hará sólo
		// un 5% de descuento.
		Scanner entrada = new Scanner (System.in);
		double precio;
		double descuento;
		double resultado;
		int unidades;
		
		System.out.println("Introduzca el precio del producto: ");
		precio=entrada.nextDouble();
		
		System.out.println("Introduzca numero de unidades: ");
		unidades = entrada.nextInt();
		
		resultado = precio * unidades;
		descuento = resultado*0.15;
		
		if(resultado > 75){
			System.out.println("Usted tiene un descuento de: " + descuento);
			System.out.println("Su precio sin descuento es: " + resultado);
			System.out.println("Su precio con descuento es: " + (resultado-descuento));
		}else{
			System.out.println("Usted tiene un descuento de: " + (resultado*0.05));
			System.out.println("Su precio sin descuento es: " + resultado);
			System.out.println("Su precio con descuento es: " +  (resultado-(resultado*0.05)));
		}
			
		entrada.close();
	}

}
