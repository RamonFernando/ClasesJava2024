package Refactorizar;

public class EjemplosIntercambios {

	public static void main(String[] args) {
		// Ejemplo para intercambiar numeros y otro para objetos.
		
		int num1=10;
		int num2=20;
		
		intercambio(num1,num2);
		System.out.println("num1 ahora vale " + num1);
		System.out.println("num2 ahora vale " + num2);
		
		int[]numeros1 = {21,24,10,10};
		int[]numeros2 = {1,5,3,0};
		
		intercambioObjetos(numeros1, numeros2);
		System.out.println("el elemento 0 de numeros1 ahora vale " + numeros1[0] );
		System.out.println("el elemento 0 de numeros2 ahora vale " + numeros2[0] );
	}
	static void intercambio(int a, int b){
		int aux;
		aux = a;
		a=b;
		b=aux;
	}
	static void intercambioObjetos(int[] a, int[] b){
		int aux;
		aux = a[0];
		a[0] = b[0]; 
		b[0] =	aux;	
	}
	
}
