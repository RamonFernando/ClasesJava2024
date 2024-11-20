package parte1.Pruebas;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class PrimeraVentana1 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeraVentana1 v2 = new PrimeraVentana1();
		}
		public PrimeraVentana1(){
			super("Mi Segunda Ventana");
			setSize(400,250);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setBackground(Color.BLUE);
			
			JButton btnPlay = new JButton("Play");
			JButton btnStop = new JButton("Stop");
			JButton btnPause = new JButton("Pause");
			
			add(btnPlay);
			add(btnStop);
			add(btnPause);
			
			setVisible(true);
			
		}
}
