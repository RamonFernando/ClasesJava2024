import java.util.Scanner;

public class EjemploArraysBidimencionales2 {

	public static void main(String[] args) {
		// Programa que pida por consola los datos de tres alumnos y sus
		// edaddes. A continuacion mostrará la media de edad de los alumnos.
		Scanner entrada = new Scanner(System.in);
		String [][] alumnos = new String [3][2];
		
		float edadMedia=0;
		
		
		for(int i = 0; i< alumnos.length;i++){
		System.out.println("Introduzca los nombre: ");
		alumnos[i][0]  = entrada.nextLine();
		System.out.println("Introduce edad: ");
		alumnos[i][1] = entrada.nextLine();
		}
		for(int j = 0; j< alumnos.length;j++){
			edadMedia = edadMedia + Integer.parseInt(alumnos[j][1]);
		}
		edadMedia = edadMedia/alumnos.length;
		System.out.println("\n Media de edad: " + edadMedia + " años. ");
	
		entrada.close();
	}

}
