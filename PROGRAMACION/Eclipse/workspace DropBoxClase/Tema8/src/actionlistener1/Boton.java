package actionlistener1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame {

	public static void main(String[] args) {
		new Boton();
	}

	public Boton() {
		super("Eventos de botones");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btnBoton = new JButton("Púlsame");
		
		GestorEventos gestor = new GestorEventos();
		btnBoton.addActionListener(gestor);
		
		JLabel lblMensaje = new JLabel("Aún no has pulsado...");

		add(btnBoton);
		add(lblMensaje);

		setVisible(true);

	}

}