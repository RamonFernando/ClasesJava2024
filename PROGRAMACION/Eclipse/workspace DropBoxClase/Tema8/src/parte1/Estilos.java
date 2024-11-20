package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class Estilos extends JFrame {

	public static void main(String[] args) {

		Estilos cajasDeChequeo = new Estilos();

		mostrarTemas();

	}

	public Estilos() {

		super("CheckBoxes");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {

			e.printStackTrace();
		}

		JLabel lblMensaje = new JLabel("Elige tu transporte favorito:");

		JCheckBox chkOpcion1 = new JCheckBox("Coche", true);
		JCheckBox chkOpcion2 = new JCheckBox("Moto", false);
		JCheckBox chkOpcion3 = new JCheckBox("Autobús", false);
		JCheckBox chkOpcion4 = new JCheckBox("Camión", false);

		ButtonGroup grupoBotones = new ButtonGroup();
		grupoBotones.add(chkOpcion1);
		grupoBotones.add(chkOpcion2);
		grupoBotones.add(chkOpcion3);
		grupoBotones.add(chkOpcion4);

		JButton btnAceptar = new JButton("Aceptar");

		add(lblMensaje);
		add(chkOpcion1);
		add(chkOpcion2);
		add(chkOpcion3);
		add(chkOpcion4);
		add(btnAceptar);

		setVisible(true);
	}

	public static void mostrarTemas() {

		LookAndFeelInfo[] lista = UIManager.getInstalledLookAndFeels();

		for (int i = 0; i < lista.length; i++) {

			System.out.println(lista[i].getClassName());

		}
	}

}