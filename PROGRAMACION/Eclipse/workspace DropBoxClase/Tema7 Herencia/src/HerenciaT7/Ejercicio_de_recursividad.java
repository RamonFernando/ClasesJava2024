
package HerenciaT7;
/**
 * 
 * @author Ramon..
 *
 */
public class Ejercicio_de_recursividad {

	public static void main(String[] args) {
		
		System.out.println(transforma(20));
			
	}
	public static String transforma(int n){
		
		if (n >= 2){
			return transforma(n/2) + n % 2;
			
		}else{
			return "" + n;
		}
	}
}
// This llama a tu propia clase. 
// Super llama a la clase Madre.
// @Overrride se asegura que la palabra que este escrita ya esta siendo utilizada.

// Metodo recursivo

// 20 transforma (10) + 0
//	transforma (5) + 0
//		transforma (2) + 1
//			transforma (1) + 0
//				1
// 20 	-->	 "10100"