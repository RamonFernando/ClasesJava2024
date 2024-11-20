package Fibonacci;

public class Fibonacci1 {
	public static void main(String[] args) {

		int n = 8;
		System.out.println(fibonacci(n));

	}

	// Este es el metodo recursivo (secuencia de fibonacci) recursivo es cuando
	// dentro de un metodo llamas al mismo metodo.
	// Esta es la manera de insertar el codigo recursivo de la secuencia de fibonacci.
	
	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
