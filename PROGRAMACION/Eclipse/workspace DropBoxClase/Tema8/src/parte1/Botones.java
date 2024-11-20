package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Botones extends JFrame {

	public static void main(String[] args) {

		Botones ventana = new Botones();

	}

	public Botones() {

		super("Mi primera ventana");
		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setLayout(new FlowLayout());
		
		JButton btnPlay = new JButton("Play");
		JButton btnPause = new JButton("Pause");
		JButton btnStop = new JButton("Stop");
		
		add(btnPlay);
		add(btnPause);
		add(btnStop);
		
		setVisible(true);

	}

}
