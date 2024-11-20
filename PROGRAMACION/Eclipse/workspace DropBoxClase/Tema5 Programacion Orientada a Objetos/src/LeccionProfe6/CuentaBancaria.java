package LeccionProfe6;
/**
 * 
 * @author Ramon.
 *
 */

public class CuentaBancaria {

	// Atributos

	private double saldo;

	// Metodo
	CuentaBancaria() {

	}

	CuentaBancaria(double saldo) { // Saldo de la cuenta
		this.saldo = saldo;
	}

	// Metodo Constructor // Para crear una cuenta bancaria nueva.

	void depositar(double dep) {
		this.saldo = dep + saldo;
	}

	boolean retiro(double retirar) {
		if (retirar > saldo) {
			return false;
		}
		saldo = saldo - retirar;
		return true;

	}

	void setSaldo(double saldo) { // Sirve para mostrarlo
		this.saldo = saldo;
	}

	double getSaldo() { // Sirve para obtenerlo
		return saldo;
	}
}
