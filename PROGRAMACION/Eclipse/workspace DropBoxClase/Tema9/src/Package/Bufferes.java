package Package;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferes {
	static String archivo = "numeros.dat";

	public static void main(String[] args) throws IOException {
		// Escribimos los números del 1 al 50 en un archivo de disco.

		escribir();

		// Leemos el contenido del anterior archivo y lo mostramos en la
		// consola.
		leer();
	}

	public static void escribir() throws IOException {

		FileOutputStream fichero = new FileOutputStream(archivo);
		BufferedOutputStream buffer = new BufferedOutputStream(fichero);
		for (int i = 1; i <= 50; i++) {
			fichero.write(i);
		}
		buffer.close();

	}

	public static boolean leer() {
		try {
			FileInputStream fichero = new FileInputStream(archivo);
			BufferedInputStream buffer = new BufferedInputStream(fichero);
			boolean eof = false;
			int caracter = 0;
			while (!eof) {
				caracter = buffer.read();
				if (caracter == -1)
					eof = true;
				else
					System.out.println(caracter + " ");
			}
			buffer.close();
			return true;
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
			return false;
		}
	}

}