package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peliculas extends JFrame implements ItemListener {

	JComboBox cmbPeliculas;
	JLabel lblProtagonista;
	String[] actores = { "Michael J. Fox", "Mathew Broderick", "Harrison Ford", "Arnold Schwarzenegger" };

	public static void main(String[] args) {
		new Peliculas();
	}

	public Peliculas() {

		super("Películas de ciencia ficción");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		String[] peliculas = { "Regreso al futuro", "Juegos de guerra", "Blade Runner", "Terminator" };

		cmbPeliculas = new JComboBox(peliculas);
		lblProtagonista = new JLabel("Protagonista: Michael J. Fox");

		cmbPeliculas.addItemListener(this);

		add(cmbPeliculas);
		add(lblProtagonista);

		setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {

		int seleccionado = cmbPeliculas.getSelectedIndex();
		lblProtagonista.setText("Protagonista: " + actores[seleccionado]);

	}

}