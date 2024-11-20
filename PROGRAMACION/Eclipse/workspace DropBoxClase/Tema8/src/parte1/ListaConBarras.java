package parte1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ListaConBarras extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ListaConBarras();
	}
	public ListaConBarras(){
		super("Lista con Barras");
		setSize(500, 400);
		setLayout(new FlowLayout());
		
		String[] asignaturas = {"Programacion", "Base de Datos", "Sistemas Informaticos","Lenguaje de Marcas","Entorno de Desarrollo"}; // Primero creas lo que quieres meter dentro
		JList <String> lstAsignaturas = new JList<>(asignaturas);// Despues creas la lista
		JScrollPane scrAsignaturas = new JScrollPane(lstAsignaturas);// Creas el scroll panel que es la barra para bajar y subir.
		scrAsignaturas.setPreferredSize(new Dimension(200,90));
		
		add(scrAsignaturas);
		setVisible(true);
		
	}
}
