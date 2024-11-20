package parte3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class Actividad extends JFrame implements ActionListener,FocusListener {

	JButton btnBoton1;
	JButton btnBoton2;
	JLabel lblMedia;

	public static void main(String[] args) {

		// Crear una ventana con dos botones y una etiqueta.
		// Al cambiar el foco de boton al otro, en la etiqueta se mostrara ha
		// recibido el foco.

		new Actividad();

	}
	public Actividad(){
		super("Ventana");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		btnBoton1 = new JButton("Primario");
		btnBoton2 = new JButton("Secundario");
		lblMedia = new JLabel("Pulsa algun boton");
		
		btnBoton1.addFocusListener(this);
		btnBoton2.addFocusListener(this);
		
		add(btnBoton1);
		add(btnBoton2);
		add(lblMedia);
		
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
}
