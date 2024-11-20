package Auxiliar;

import java.util.Scanner;

public class Alumno {

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String toString() {
		return "Numero de Expediente: " + numExpediente + " ,Apellidos: " + apellidos + " ,Nombre: " + nombre + "Grupo: "
				+ grupo;

	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce No. Expediente: ");
		numExpediente = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Introduce Apellidos: ");
		apellidos = entrada.nextLine();
		System.out.println("Introduce Nombre: ");
		nombre = entrada.nextLine();
		grupo.leeDatos();
		

		entrada.close();
	}
}
