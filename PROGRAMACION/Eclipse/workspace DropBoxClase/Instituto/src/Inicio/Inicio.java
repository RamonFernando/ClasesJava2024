package Inicio;

import Auxiliar.*;
import Instituto.*;
import Auxiliar.Alumno;
import Auxiliar.Grupo;
import Instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {
		
		Grupo G1 = new Grupo("ESO",1,"A");
		Grupo G2 = new Grupo ("BACHILLER",2,"B");
		Grupo G3 = new Grupo();
		G3.leeDatos();
		
		Alumno A1 = new Alumno(2,"Roman","Sanchez",G2);
		Alumno A2 = new Alumno(3,"Luis","Angel",G1);
		Alumno A3 = new Alumno();
		A3.leeDatos();
		Instituto Inst = new Instituto(10);
		
		Inst.addAlumnos(A1);
		Inst.addAlumnos(A2);
		Inst.addAlumnos(A3);
		
		A1.leeDatos();
		
		Inst.delAlumno(A2);
		
		Inst.muestraAlumnos();
		
		Inst.numAlumno();
		
		Inst.buscaAlumno(3);
		
	}

}
