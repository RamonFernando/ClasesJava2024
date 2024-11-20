package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartTV extends JFrame implements KeyListener {

	private JLabel lblTele;
	private int x = 20;
	private int y = 20;

	public static void main(String[] args) {
		// KeyListener: Detecta las pulsaciones del teclado.
		// Estos eventos ocurren cuando se puilsa una tecla.

		new StartTV();
	}

	public StartTV() {
		super("Start TV");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		ImageIcon imgTele = new ImageIcon("iconos/67.png");
		lblTele = new JLabel(imgTele);
		lblTele.setBounds(x, y, 24, 24);
		lblTele.addKeyListener(this);

		add(lblTele);
		

		

		setVisible(true);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyChar()) {

		case 'w': // Arriba
			y = y - 5;
			break;

		case 's': // Abajo
			y = y + 5;
			break;

		case 'a': // Derecha
			x = x - 5;
			break;

		case 'd': // Izquierda
			x = x + 5;
			break;
		}

	}
}
