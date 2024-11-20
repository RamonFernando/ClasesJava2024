package Algebra;

public class Inicio {

	public static void main(String[] args) {
		// Polinomios
		
		Polinomio p = new Polinomio (new double[] {-3, -2, 5, 1});
		Polinomio q = new Polinomio (new double[] {-3, -2, 5, 1});
	
		Polinomio suma = p.sumar(q);
		System.out.println(suma.toString());
		System.out.println(q.getGrado());
	}	
}
