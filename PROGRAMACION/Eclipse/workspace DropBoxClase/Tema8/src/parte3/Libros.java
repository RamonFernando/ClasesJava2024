package parte3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Libros extends JFrame implements ItemListener {

	JComboBox<String> cmbLibros;
	JLabel lblAutor;

	String[] autores = { "Katherine Neville", "Danielle Steel", "Ken Follet", "Manel Joan i Arinyo" };

	public static void main(String[] args) {
		new Libros();
	}

	public Libros() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("Problemas al cargar el look and feel");
		}

		setLayout(new FlowLayout());

		String[] libros = { "El fuego", "La villa", "La caída de los gigantes", "El cas torreforta" };
		lblAutor = new JLabel("Autor: Katherine Neville");

		cmbLibros = new JComboBox<String>(libros);
		cmbLibros.addItemListener(this);
		add(cmbLibros);
		add(lblAutor);

		setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {

		int elegido = cmbLibros.getSelectedIndex();
		lblAutor.setText(autores[elegido]);
	}

}
