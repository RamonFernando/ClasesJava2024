package Refactorizar;
/**
 * 
 * @author Ramón
 *
 */
import java.util.Scanner;
public class Arrays16 {

	public static void main(String[] args) {
		// 16.- Escribe un programa que vaya preguntando y guardando en un array
		// el nombre de un alumno y sus notas de exámenes, trabajos y actitud en
		// un trimestre. Así para tres alumnos. A continuación mostrará una
		// lista con el nombre de cada alumno y su nota de evaluación, que
		// vendrá dada por la fórmula:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce notas de 3 alumnos: \n=============================");
		
		String[][] notas = new String [3][4];
		
		float notas1,notas2,notas3,notas4;
		
		for(int i = 0; i<notas.length;i++){
			System.out.println("Nombre: ");
			notas[i][0]=entrada.nextLine();
			System.out.println("Examenes: ");
			notas[i][1]=entrada.nextLine();
			System.out.println("Trabajos: ");
			notas[i][2]=entrada.nextLine();
			System.out.println("Actitud: ");
			notas[i][3]=entrada.nextLine();
		}
		for(int i= 0; i< notas.length;i++){
			notas1 = Float.parseFloat(notas[i][0]);
			notas2 = Float.parseFloat(notas[i][1]);		
			notas3 = Float.parseFloat(notas[i][2]);
			notas4 = Float.parseFloat(notas[i][3]);
		}
		System.out.println();
	
		
		
		entrada.close();
	}

}
