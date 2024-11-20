package parte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrimeraVentana extends JFrame {

	public static void main(String[] args) {
		PrimeraVentana v1 = new PrimeraVentana();

	}
	public PrimeraVentana(){
		super("Mi Primera Ventana");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.BLUE);
		
		FlowLayout disposicion = new FlowLayout();
		setLayout(disposicion);
		
		JButton btnPlay = new JButton("Play");
		JButton btnPause = new JButton("Pause");
		JButton btnStop = new JButton("Stop");
		
		add(btnPlay);
		add(btnPause);
		add(btnStop);
		
		setVisible(true);
	}
	
}
