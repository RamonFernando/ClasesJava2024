package Entrega1_EjerciciosRecursivos;

/**
 * 
 * @author Ramon..
 *
 */
public class Ejercicio1 {
	// 1.- Crea una clase con un método, transforma(int dato) que transforme un
	// número entero en base diez a binario.
	// Utiliza un procedimiento recursivo.
	
	// Algoritmo Iterativo: 
	// Los algoritmos iterativos son algoritmos que se caracterizan por
	// ejecutarse mediante ciclos
	public static void main(String[] args) {
		Transformar(12);

	}

	public static void Transformar(int dato) {

		if (dato == 1 || dato == 0) {
			System.out.println(" Metodo recursivo \n" + "****************** ");
			System.out.print("El numero en binario es: " + dato);

		} else {

			Transformar(dato / 2);

			System.out.print(dato % 2);

		}

	}

}
