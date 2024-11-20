package actionlistener3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame {

	JLabel lblMensaje;

	public static void main(String[] args) {
		new Boton();
	}

	public Boton() {
		super("Eventos de botones");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btnBoton = new JButton("Pulsame");

		lblMensaje = new JLabel("Bien no has pulsado...");

		btnBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lblMensaje.setText("Muy bien");
			}

		});

		add(btnBoton);
		add(lblMensaje);

		setVisible(true);

	}

}