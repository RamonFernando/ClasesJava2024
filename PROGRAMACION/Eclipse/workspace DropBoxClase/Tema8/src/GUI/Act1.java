package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Act1 extends JFrame {

	public static void main(String[] args) {
		new Act1();

	}

	public Act1() {
		super("Ejercicios 1 de GUI");
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btn1 = new JButton("Formatear");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?", "Confirmación de formateo",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
			}
		});

		JButton btn2 = new JButton("DNI");

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(null, "Escribe tu DNI", "Confirmación de identidad",
						JOptionPane.QUESTION_MESSAGE);
			}
		});

		JButton btn3 = new JButton("Escaneo");

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Se ha detectado un escaneo de red desde la IP 192.168.1.51",
						"Alerta de seguridad", JOptionPane.WARNING_MESSAGE);
			}
		});

		JButton btn4 = new JButton("Serie");

		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String[] series = { "Futurama", "Los Simpson", "Héroes" };
				JOptionPane.showOptionDialog(null, "Haz clic en tu serie favorita", "Confirmación de formateo", 0,
						JOptionPane.INFORMATION_MESSAGE, null, series, series[2]);
			}
		});

		JButton btn5 = new JButton("Host");

		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String[] host = { "Apache", "IIS", "Nginx", "Node.JS" };
				JOptionPane.showOptionDialog(null, "¿Qué servidor web desea para su hosting?",
						"Elección de servidor web", 0, JOptionPane.INFORMATION_MESSAGE, null, host, host[1]);
			}
		});

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);

		setVisible(true);
	}

}
