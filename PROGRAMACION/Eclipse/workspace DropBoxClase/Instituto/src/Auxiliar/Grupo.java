package Auxiliar;

import java.util.Scanner;

public class Grupo {

	private String nivel;
	private int curso;
	private String clase;
	
	public Grupo(String nivel, int curso, String clase){
		this.nivel=nivel;
		this.curso=curso;
		this.clase=clase;
	}
	public Grupo(){
		
	}

	public String toString() {
		return "Grupo nivel=" + nivel + ", curso=" + curso + ", clase=" + clase;
	}
	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce nivel: ");
		nivel = entrada.nextLine();
		System.out.println("Introduce Curso: ");
		curso = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Introduce Clase: ");
		clase = entrada.nextLine();
		
		entrada.close();
	}
}
