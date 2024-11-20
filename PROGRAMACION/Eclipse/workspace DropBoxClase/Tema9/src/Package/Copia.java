package Package;


import java.io.*;

public class Copia {

	public static void main(String[] args) {
		try {

			FileInputStream entrada = new FileInputStream("logo.jpg");
			FileOutputStream salida = new FileOutputStream("copia.jpg");

			int byteLeido = 0;
			boolean eof = false;

			while (eof == false) {

				byteLeido = entrada.read();
				if (byteLeido == -1) {
					eof = true;
				} else {
					salida.write(byteLeido);
				}

			}

			entrada.close();
			salida.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}