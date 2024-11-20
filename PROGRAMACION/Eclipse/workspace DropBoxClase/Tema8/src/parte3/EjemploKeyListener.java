package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploKeyListener extends JFrame implements KeyListener {

	JLabel lblTeclaPulsada;

	public static void main(String[] args) {
		new EjemploKeyListener();
	}

	public EjemploKeyListener() {

		super("Ejemplo de KeyListener");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		lblTeclaPulsada = new JLabel("Pulsa una tecla!");

		addKeyListener(this);

		add(lblTeclaPulsada);

		setVisible(true);

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
			lblTeclaPulsada.setText("Has pulsado CTRL.");
		} else if (e.getKeyCode() == KeyEvent.VK_F1) {
			lblTeclaPulsada.setText("Has pulsado F1.");
		} else {
			lblTeclaPulsada.setText("Has pulsado una tecla cualquiera.");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// lblTeclaPulsada.setText("Has pulsado: " + e.getKeyChar());
	}

}
