
/**
 * 
 * @author Ramon.
 *
 */
import java.util.Scanner;

public class Ejemplo_Metodos {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// Ejemplo de metodos...

		System.out.println("Bienvenido a casa.");

		mayordomo();

		System.out.println("Traigame un coñac");

		System.out.println("Esta es la tabla del 5: ");
		tabla5();

		Autoenganyo();

		System.out.println("El cuadrado del numero 20 " + " es " + cuadrado(20));
		
		
		System.out.println("El cubo de 13 es: " + cubo(13.5f));
		
		System.out.println("20 elevado a 3 da: " + elevar(20,3));
		
		System.out.println("El volumen de una habitacion de 3x4x3 metros es: " + volumen (3,4,3) + "metros cubicos");
		
		// Modulo, procedimiento, funcio, metodo.
		entrada.close();
	}

	private static void Autoenganyo() {
		// TODO Auto-generated method stub
		
	}

	static void mayordomo() {
		System.out.println("¿Que se le ofrece, señor? ");
		System.out.println("A su servicio.");
	}

	static void tabla5() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("5 x " + i + " = " + 5 * i);

		}
	}

	static void Autoenganyo1() {
		int edad;
		System.out.println("¿Que edad tienes?");
		edad = entrada.nextInt();
		System.out.println("No parece que tengas: " + edad + " años.");

	}

	static int cuadrado(int num) {
		int resultado = num * num;
		return resultado;

	}
	static float cubo (float valor){
		float c = valor * valor * valor;
		return c;
		// return valor*valor*valor;
	}
	// resive 2 enteros eleva uno al otro y el resultado lo devuelve.
	static int elevar(int base, int exponente){
		return (int) Math.pow(base, exponente);
		
		
	}
	//Declarar la funcion volumen y rellenarla.
	// Multiplica el ancho largo y alto y guarda el resultado en la variable.
	static int volumen (int ancho, int alto, int largo){
		int vol = ancho*largo*alto;
		return vol;
	}
}
