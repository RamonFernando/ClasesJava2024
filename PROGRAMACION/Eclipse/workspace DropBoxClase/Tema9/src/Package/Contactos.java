package Package;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Contactos {
	

	public static void main(String[] args) {
		// El programa pide nombre y telefono de varias personas y los va
		// guardando en un archivo de texto con el formato:
		// Nombre
		// Telefono
		// ----
		// nombre
		// telefono
		// ----
		// Al preguntar los datos, se preguntara al usuario si quiere seguir
		// introduciendo nombres. Si contesta "no", se terminara el programa.
		
		String nombre;
		String telefono;
		String opc;
		Scanner entrada = new Scanner (System.in);
		boolean seguir=true;
		while (seguir){
			System.out.println("Introduzca nombre ");
			nombre = entrada.nextLine();
			System.out.println("Introduzca numero de telefono");
			telefono = entrada.nextLine();
			Guardar(nombre,telefono);
			
			System.out.println("Quieres continuar ?");
			opc=entrada.nextLine().toLowerCase().substring(0, 1);
			if(opc.equals("s")){
				seguir = true;
			}else{
				seguir = false;
			}
			
			entrada.close();
		}
	 
	}
	public static void Guardar(String nombre, String  telefono){
		
		try{
			FileWriter archivo = new FileWriter("contactos.txt",true);
			BufferedWriter buffer = new BufferedWriter(archivo);
			
			buffer.write(nombre);
			buffer.newLine();
			buffer.write(telefono);
			
			buffer.close();
			
		}
		
	 catch(IOException ioe){
		 System.out.println("Error E/:S" + ioe.toString());
	 }
		
		
		
		
		
		
		
		
		
		
	}
}
