package conversion;

public class Conversor {

	private final static double KM_A_MILLAS = 0.621371;
	private final static double MB_A_ATM = 0.000986923;
	private final static double CAL_A_JULIOS = 4184;

	// Métodos Constructor
	public Conversor() {

	}

	// Métodos
	public static double millas(double km) {
		return km * KM_A_MILLAS;
	}

	public static double km(double millas) {
		return millas / KM_A_MILLAS;
	}

	public static double milibares(double atm) {
		return atm * MB_A_ATM;
	}

	public static double atm(double milibares) {
		return milibares / MB_A_ATM;
	}

	public static double julios(double calorias) {
		return calorias * CAL_A_JULIOS;
	}
	public static double calorias (double julios){
		return julios / CAL_A_JULIOS;
	}
	
}