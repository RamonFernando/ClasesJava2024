package Package;

import java.io.*;

public class EscrituraBytes {

	public static void main(String[] args) {

		try {
			FileOutputStream salida = new FileOutputStream("numeros.dat");

			for (int i = 100; i <= 150; i++) {
				salida.write(i);
			}

			salida.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}