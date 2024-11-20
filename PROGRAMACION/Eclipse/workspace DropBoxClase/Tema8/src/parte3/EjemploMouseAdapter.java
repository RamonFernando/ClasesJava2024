package parte3;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EjemploMouseAdapter extends JFrame {

	private JLabel lblMensaje;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new EjemploMouseAdapter();

	}

	public EjemploMouseAdapter() {

		super("Ejemplo de MouseAdapter");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		lblMensaje = new JLabel("Clicame!");

		addMouseListener(new MouseAdapter() {
		// Este metodo permite quitar los demas metodos MouseAdapter

			@Override
			public void mouseClicked(MouseEvent e) {

				lblMensaje.setText("Has hecho click!");
			}
		});

		add(lblMensaje);
		setVisible(true);

	}
}
