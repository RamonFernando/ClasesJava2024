package Entrega1_EjerciciosRecursivos;

import org.omg.Messaging.SyncScopeHelper;

public class Repaso_Recursividad {
	// 1.- Crea una clase con un método, transforma(int dato) que transforme un
	// número entero en base diez a binario.
	// Utiliza un procedimiento recursivo.
	
	// Algoritmo Iterativo: 
	// Los algoritmos iterativos son algoritmos que se caracterizan por
	// ejecutarse mediante ciclos
	
	public static void main(String[] args) {
		Transformar(12);

	}
	
	public static void Transformar(int dato){
		
		if(dato==1 || dato == 0){
			System.out.print(dato);
		}else{
			Transformar(dato/2);
			System.out.print(dato % 2);
		}
		
	
	}
}

/* Metodo Recursivo.
 * 
 * 	if(dato<2){
 * 		return "" + dato/2
 * }else{
 * 		return Transformar(dato/2) + "" + dato % 2;	
 * 	
 * }
 * 
 * 	en Main:
 * 	Sistem.out.println(Transformar dato/2);
 * 
 * 
 * */
