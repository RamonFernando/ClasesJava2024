package parte1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CuadroDeDialogo extends JFrame {

	public static void main(String[] args) {

		new CuadroDeDialogo();

	}

	public CuadroDeDialogo() {

		super("Pruebas con cuadros de diálogo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		setLayout(new FlowLayout());

		JButton btnMostrar = new JButton("Mostrar");

		btnMostrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// JOptionPane.showMessageDialog(null,
				// "Se han guardado los últimos cambios", "Guardar cambios",
				// JOptionPane.INFORMATION_MESSAGE);
//				int respuesta = JOptionPane.showConfirmDialog(null, 
//						"¿Quieres salir de la aplicación?", 
//						"Salir de la aplicación",
//						JOptionPane.YES_NO_OPTION, 
//						JOptionPane.WARNING_MESSAGE);
//
//				if(respuesta == JOptionPane.YES_OPTION){
//					System.exit(0);
//				}
				
//				String nombre = 
//						JOptionPane.showInputDialog(
//								null,
//								"¿Cómo te llamas?",
//								"Nombre del usuario",
//								JOptionPane.INFORMATION_MESSAGE);
//				
//				System.out.println("El nombre del usuario es " + nombre);
				
				String[] cursos = {"Java","C++","PHP"};
				int opcion = JOptionPane.showOptionDialog(null, 
						"¿Qué curso sigues?", 
						"Cursos", 
						0, 
						JOptionPane.QUESTION_MESSAGE, 
						null, 
						cursos, 
						cursos[2]);
				
				System.out.println("Opción elegida: " + cursos[opcion]);
				
				

			}
		});

		add(btnMostrar);

		setVisible(true);

	}

}
