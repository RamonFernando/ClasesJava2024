package LeccionProfe6;

/**
 * 
 * @author Ramon. Cuenta Bancaria.
 *
 */

public class CuentaBancaria_Main {

	public static void main(String[] args) {
		// Atributos: saldo
		// Metodos:
		// - Constructor (tomando como parametros el saldo)
		// - Depositar (toma una cantidad y la suma al saldo)
		// - Boolean retirar (lo contrario)
		// - Metodos de acceso para el saldo.

		CuentaBancaria cuenta = new CuentaBancaria(1000);

		cuenta.depositar(200);

	}

}
