package Package;

import java.io.*;

public class Encriptado {

	public static void main(String[] args) {

		String nombreArchivo = "mensaje.txt";

		cifrar(nombreArchivo);

//		descifrar(nombreArchivo + ".nuevo");

	}

	public static void cifrar(String nombreArchivo) {

		try {

			// Creamos los objetos para acceder al archivo origen y al archivo
			// cifrado.
			FileInputStream ficheroEntrada = new FileInputStream(nombreArchivo);
			BufferedInputStream bufferEntrada = new BufferedInputStream(ficheroEntrada);

			FileOutputStream ficheroSalida = new FileOutputStream(nombreArchivo + ".nuevo");
			BufferedOutputStream bufferSalida = new BufferedOutputStream(ficheroSalida);

			// Vamos leyendo byte a byte y guardando sumando a cada byte 1
			boolean eof = false;
			int byteLeido = 0;
			while (!eof) {

				byteLeido = bufferEntrada.read();
				
				if (byteLeido == -1) {
					eof = true;
				} else {
					if (byteLeido == 255) {
						bufferSalida.write(0);
					} else {
						bufferSalida.write(byteLeido + 1);
					}
				}

			}

			bufferEntrada.close();
			bufferSalida.close();

		} catch (IOException e) {
			System.out.println("Errorcillo de E/S");
		}

	}

	public static void descifrar(String nombreArchivo) {

		try {
			// Creamos los objetos para acceder al archivo origen y al archivo
			// cifrado.
			FileInputStream ficheroEntrada = new FileInputStream(nombreArchivo);
			BufferedInputStream bufferEntrada = new BufferedInputStream(ficheroEntrada);

			FileOutputStream ficheroSalida = new FileOutputStream(nombreArchivo + ".nuevo");
			BufferedOutputStream bufferSalida = new BufferedOutputStream(ficheroSalida);

			// Vamos leyendo byte a byte y guardando sumando a cada byte 1
			boolean eof = false;
			int byteLeido = 0;
			while (!eof) {

				byteLeido = bufferEntrada.read();
				if (byteLeido == -1) {
					eof = true;
				} else {
					if (byteLeido == 0) {
						bufferSalida.write(255);
					} else {
						bufferSalida.write(byteLeido - 1);
					}
				}

			}

			bufferEntrada.close();
			bufferSalida.close();
		} catch (IOException e) {
			System.out.println("Errorcillo de E/S.");
		}

	}

}