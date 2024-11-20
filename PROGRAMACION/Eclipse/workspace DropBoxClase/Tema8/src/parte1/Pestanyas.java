package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pestanyas extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pestanyas();

	}

	public Pestanyas() {
		super("Pestanyas");
		setSize(500, 400);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JTabbedPane panelPestanya = new JTabbedPane();

		// Pestaña 1
		JPanel panelClientes = new JPanel();
		JButton btnAnyadirCliente = new JButton("Anyadir clientes");
		JButton btnListarCliente = new JButton("Listar Clientes");
		panelClientes.add(btnAnyadirCliente);
		panelClientes.add(btnListarCliente);

		ImageIcon iconoClientes = new ImageIcon("iconos/13.png");

		// Pestaña 2

		// Panel de pestañas Global
		panelPestanya.addTab("Clientes", iconoClientes, panelClientes);
		add(panelPestanya);
		setVisible(true);

	}
}
