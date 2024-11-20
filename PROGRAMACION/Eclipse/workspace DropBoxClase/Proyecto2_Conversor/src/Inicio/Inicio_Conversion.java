package Inicio;

import java.util.*;

import conversion.*;

public class Inicio_Conversion {

	public static void main(String[] args) {
		// Metodo Conversor.

		Scanner entrada = new Scanner(System.in);

		System.out.println("km ? ");
		double km = entrada.nextDouble();

		double millas = Conversor.millas(km);
		System.out.println(km + " son " + millas + " millas. ");

		// Preguntamos una distancia en millas y la pasamos a kilometros (km).

		System.out.println("Millas: ?");
		millas = entrada.nextDouble();

		km = Conversor.km(millas);
		System.out.println(millas + " son " + km + " kilometros");

		// Pasamos de milibares (MB) a atmosfera (atm).

		System.out.println("Atmosfera: ? ");
		double atm = entrada.nextDouble();
		
		double milibares = Conversor.atm(atm);
		System.out.println(milibares + " milibares" + " son " + atm + " atmosfera.");
		

		System.out.println("Milibares: ? ");
		milibares = entrada.nextDouble();

		atm = Conversor.milibares(milibares);
		System.out.println(atm + " atmosfera" + " son " + milibares + "milibares.");
		
		System.out.println("Calorias: ?");
		double calorias = entrada.nextDouble();
		
		double julios = Conversor.julios(calorias);
		System.out.println(julios + " Julios: " + " son " + calorias + "calorias.");
		
		System.out.println("Julios: ?");
		julios = entrada.nextDouble();
		
		calorias = Conversor.calorias(julios);
		System.out.println(calorias + " Calorias: " + " son " + julios + "Julios.");
		
	}

}
