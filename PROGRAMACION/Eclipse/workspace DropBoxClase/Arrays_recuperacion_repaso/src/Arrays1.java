
public class Arrays1 {

	public static void main(String[] args) {
		// 1.- Crea un array de Strings llamado estaciones cuyos valores sean
		// los nombres de las cuatro estaciones del año. Haz que después se
		// muestren todos los valores mediante un bucle for.

		String Estaciones[] = new String[4];

		Estaciones[0] = "primavera";
		Estaciones[1] = "verano";
		Estaciones[2] = "otoño";
		Estaciones[3] = "invierno";

		System.out.println("Estaciones del año:" + "\n===================");
		for (int i = 0; i < Estaciones.length; i++) {
			System.out.println(Estaciones[i]);
		}

	}

}
