import java.util.Scanner;

/**
 * Programa que pasa un número de decimal a binario
 * 
 * @author Ramon..
 */
public class CodigoDecim_Binario {

	public static void main(String[] args) {

		int numero, exp, digito, numEntrado;
		double binario;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.print("Introduce un numero entero >= 0: ");
			numero = entrada.nextInt();
			numEntrado = numero;
		} while (numero < 0);

		exp = 0;
		binario = 0;

		// Algoritmo Iterativo:
		// Los algoritmos iterativos son algoritmos que se caracterizan por
		// ejecutarse mediante ciclos
		while (numero != 0) { // Sigue dividiendo el numero entre dos hasta que
								// este sea 0 (Metodo recursivo).
			digito = numero % 2; // Este es el resto de la division por 2.
			binario = binario + digito * Math.pow(10, exp);
			exp++;
			numero = numero / 2;
		}
		System.out.println("\n" + "*Decimal a binario*" + "\n  ***************");
		System.out.printf("El numero: " + numEntrado + " en Binario es: %.0f %n", binario);
		entrada.close();
	}

	/*
	 * Algorismo Iterativo 10 % 2 = 0 0+0*(10^0=1) = 0 exp = 1 numero =5
	 * 
	 * 5%2 = 1 0+1*(10^1=10) = 10 2 5/2=2
	 * 
	 * 2%2=0 10 + 0*(10^2= 100) = 10 exp 3 numero = 1
	 * 
	 * 1%2=1 10 + (1*10^3=1000) = 1010 4 0
	 * 
	 * 
	 * 
	 */

	// Metodo recursivo.
	// public int Resta(int n)
	// {
	// if(n == 0)
	// return 0;
	// return Resta(n - 1);
	// }

	/*
	 * n=10 9 8 7 6 5 4 3 2 1 0 final
	 * 
	 * 
	 * 
	 */
}