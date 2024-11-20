
public class Ejercicio2Recursividad {

	public static void main(String[] args) {
		// 
		
		System.out.println("El numero binario es: " + transforma(20));
	}
	
	public static String transforma(int n){
		String binario = "";
		
		while(n>0){
			binario = n % 2 + binario;
			n = n/2;
		}
		return binario;
	}
}
