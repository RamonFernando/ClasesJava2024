package Package;

import java.io.*;

public class LectorBytes {

	public static void main(String[] args) {

		try {
			FileInputStream archivo = new FileInputStream("nombres.txt");

			int byteLeido = 0;

			boolean eof = false; // End Of File
			
			int contador = 0;
			
			while (eof == false) {

				byteLeido = archivo.read(); // Nos lee un byte

				if (byteLeido == -1) {
					eof = true;
				} else {
					System.out.print(" " + byteLeido);
					contador++;
				}

			}

			archivo.close();
			
			System.out.println("\nNúmero de bytes: " + contador);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}