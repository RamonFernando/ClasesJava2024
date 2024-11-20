package parte3;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DosBotones extends JFrame implements ActionListener {

	JLabel lblMensaje;  // Esta es una variable global por lo que se vuelve de color azul.
	JButton btnRojo;
	JButton btnAzul;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DosBotones();
	
	}
	public DosBotones(){
		
		super("Pulsa un boton!");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		 btnRojo = new JButton("Rojo");
		 btnAzul = new JButton("Azul");
		
		btnRojo.addActionListener(this);
		btnAzul.addActionListener(this);
		
		lblMensaje = new JLabel("No se ha pulsado ningun boton todavia");
		
		add(btnRojo);
		add(btnAzul);
		add(lblMensaje);
		
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton botonPulsado = (JButton) e.getSource();
		
		
	
		if(botonPulsado == btnRojo){
			lblMensaje.setText("Has pulsado el boton Rojo!!");
		}
		if(botonPulsado == btnAzul){
			lblMensaje.setText("Has pulsado el boton Azul!!");
		}
	}
	

	
	
}
