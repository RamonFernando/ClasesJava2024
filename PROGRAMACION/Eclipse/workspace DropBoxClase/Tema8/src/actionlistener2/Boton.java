package actionlistener2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener {

	JLabel lblMensaje;

	public static void main(String[] args) {
		new Boton();
	}

	public Boton() {
		super("Eventos de botones");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btnBoton = new JButton("Púlsame");

		btnBoton.addActionListener(this);

		lblMensaje = new JLabel("Aún no has pulsado...");

		add(btnBoton);
		add(lblMensaje);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Botón pulsado!!!!");
		lblMensaje.setText("Muy bien!!!");

	}

}