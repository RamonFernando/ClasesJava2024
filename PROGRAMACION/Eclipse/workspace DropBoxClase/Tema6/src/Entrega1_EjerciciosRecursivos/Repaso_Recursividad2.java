package Entrega1_EjerciciosRecursivos;

public class Repaso_Recursividad2 {

	public static void main(String[] args) {
		// 2.- Realiza el ejercicio anterior con un algoritmo iterativo.
		// Algoritmo Iterativo:
		// Los algoritmos iterativos son algoritmos que se caracterizan por
		// ejecutarse mediante ciclos
		
		
		System.out.println(Transforma(20));
		
	
		
		
		
	}
	public static String Transforma(int num){
		String binario = "";
		while(num > 0){
			binario = num % 2 + binario;
			num = num/2;
			
		}
		System.out.println("El numero es: ");
		return binario;
	}
	
}
