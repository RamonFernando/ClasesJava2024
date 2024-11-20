package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Ramon
 */

public class FocoBotones extends JFrame implements FocusListener {

	public static void main(String[] args) {

		new FocoBotones();

	}

	JButton btn1;
	JButton btn2;

	JLabel lblInfo;

	public FocoBotones() {

		super("Prueba foco con botones");
		setSize(275, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		btn1 = new JButton("Botón 1");
		btn2 = new JButton("Botón 2");

		btn1.addFocusListener(this);
		btn2.addFocusListener(this);

		lblInfo = new JLabel("Ningún botón tiene el foco");

		add(btn1);
		add(btn2);
		add(lblInfo);

		setVisible(true);

	}

	@Override
	public void focusGained(FocusEvent e) {
		JButton boton = (JButton) e.getSource();

		if (boton == btn1) {
			lblInfo.setText("El botón 1 tiene el foco");
		} else if (boton == btn2) {
			lblInfo.setText("El botón 2 tiene el foco");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		lblInfo.setText("Ningún botón tiene el foco");
	}

}
