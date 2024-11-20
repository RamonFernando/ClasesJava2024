package parte2;

import java.awt.*;
import javax.swing.*;

public class PruebasGrid extends JFrame {

	public static void main(String[] args) {
		new PruebasGrid();
	}

	public PruebasGrid() {

		super("Pruebas con GridLayout");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridLayout(2, 4, 5, 10));

		JButton btn1 = new JButton("Alta");
		JButton btn2 = new JButton("Baja");
		JButton btn3 = new JButton("Listado");
		JButton btn4 = new JButton("Nuevo");

		JButton btn5 = new JButton("Alta");
		JButton btn6 = new JButton("Baja");
		JButton btn7 = new JButton("Listado");
		JButton btn8 = new JButton("Nuevo");

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);

		setVisible(true);
	}

}
