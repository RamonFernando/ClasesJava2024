package Instituto;

import java.util.Scanner;

import Auxiliar.*;

public class Instituto {
	Scanner entrada = new Scanner(System.in);
	private final int MAX_ALUMNOS=10;
	private Alumno alumno[] = new Alumno[MAX_ALUMNOS];
	
	public Instituto(int Inst) {
		
	}
	public void addAlumnos(Alumno alu){
		for (int i = 0; i < alumno.length; i++) {
			if(alumno[i] == null){
				alumno[i]= alu;
				break;
			}
		}
	}
	public void delAlumno(Alumno borAlumno){
		for (int i = 0; i < alumno.length; i++) {
			
			if(alumno[i] == borAlumno){
				alumno[i] = null;
				break;
			}
		}
	}
	public void muestraAlumnos(){
		for (int i = 0; i < alumno.length; i++) {
			if(alumno[i] != null){
				System.out.println("Alumno: " + alumno[i].getNombre() + alumno[i].getApellidos());
			}
		}
	}
	public int numAlumno(){
		int cont = 0;
		for (int i = 0; i < alumno.length; i++) {
			if(alumno[i] != null){
				cont = cont + 1;
				
				
			}
			
		}
		return cont;
	}
	public int buscaAlumno(int numExp){
		for (int i = 0; i < alumno.length; i++) {
			if(alumno[i].getNumExpediente() == numExp){
				return i;
			}
			
		}
		
		return -1;
	}
	
	
	
}
