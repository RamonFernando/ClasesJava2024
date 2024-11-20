package parte3;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TresBotones extends JFrame implements ActionListener {

	JLabel lblMensaje;
	JButton btnNoticias;
	JButton btnDeportes;
	JButton btnEntretenimiento;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TresBotones();

	}
	public TresBotones(){
		super ("Periodico");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		btnNoticias = new JButton("Noticias");
		btnDeportes = new JButton("Deportes");
		btnEntretenimiento = new JButton("Entretenimiento");
		
		btnNoticias.addActionListener(this);
		btnDeportes.addActionListener(this);
		btnEntretenimiento.addActionListener(this);
		
		
		
		lblMensaje = new JLabel("No se ha pulsado ningun boton!!");
		
		add(btnNoticias);
		add(btnDeportes);
		add(btnEntretenimiento);
		add(lblMensaje);
		
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton botonPulsado = (JButton) e.getSource();
		
		if(botonPulsado == btnNoticias){
			lblMensaje.setText("Has pulsado las Noticias");
		}
		if(botonPulsado == btnDeportes){
			lblMensaje.setText("Has pulsado las Deportes");
		}
		if(botonPulsado == btnEntretenimiento){
			lblMensaje.setText("Has pulsado las Entretenimiento");
		}
	}
	
}
