package Package;

import java.io.*;

public class LeerTexto {

	public static void main(String[] args) {
		leer("src/Bufferes.java");
	}
	
	public static void leer(String nombreArchivo){
		
		try {
			FileReader archivo = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(archivo);
			
			String linea = "";
			boolean eof = false;
			
			while(!eof){
				
				linea = buffer.readLine();
				if(linea == null){
					eof = true;
				}else{
					System.out.println(linea);
				}
				
			}
			
			buffer.close();
			
			
			
			
			
		} catch(IOException ioe){
			System.out.println("Error de E/S.");
		}
		
		
		
	}

}