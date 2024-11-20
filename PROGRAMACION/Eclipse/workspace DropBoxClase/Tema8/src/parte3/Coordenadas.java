package parte3;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Coordenadas extends JFrame implements MouseListener {

	private JLabel lblCoordenadas;
	private JLabel lblBoton;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Coordenadas();
	}

	public Coordenadas() {
		super("Coordenadas");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		lblCoordenadas = new JLabel("Has click en la ventana!");

		add(lblCoordenadas);

		addMouseListener(this);

		setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Cuando hay evento en el que sueltas el click del raton dentro de la
		// ventana se ejecutan los otros metodos.
		
		int x = e.getX();
		int y = e.getY();
		
		lblCoordenadas.setText("Coordenadas: ("+ x + ", "+ y +")");
		lblBoton = new JLabel("");
		
		int  boton = e.getButton();
		
		add(lblBoton);
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Se produce cuando entras desde fuera de la ventana con el mouse a
		// ella.

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Se produce cuando entras a la ventana y sales.

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Cuando apretas constantemente el raton.

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
