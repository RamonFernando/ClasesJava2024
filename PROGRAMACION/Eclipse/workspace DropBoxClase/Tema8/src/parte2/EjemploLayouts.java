package parte2;

import java.awt.*;
import javax.swing.*;

public class EjemploLayouts extends JFrame {

	public static void main(String[] args) {
		new EjemploLayouts();
	}

	public EjemploLayouts() {

		super("Biblioteca");
		setSize(390, 110);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridLayout(1, 2));

		// Panel a la izquierda.
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblTitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField(15);
		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField(15);

		panelIzquierdo.add(lblTitulo);
		panelIzquierdo.add(txtTitulo);
		panelIzquierdo.add(lblAutor);
		panelIzquierdo.add(txtAutor);

		add(panelIzquierdo);

		// Panel a la derecha.
		JButton btnAlta = new JButton("Alta");

		add(btnAlta);

		setVisible(true);
	}

}