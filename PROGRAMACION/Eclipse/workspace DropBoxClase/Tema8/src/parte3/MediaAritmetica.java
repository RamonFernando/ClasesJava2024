package parte3;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class MediaAritmetica extends JFrame implements FocusListener{
	
	JTextField txt1;
	JTextField txt2;
	JTextField txt3;
	JLabel lblMedia;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MediaAritmetica();

	}
	public MediaAritmetica(){
		super("Media Aritmetica");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		txt1 = new JTextField("0", 5);
		txt2 = new JTextField("0", 5);
		txt3 = new JTextField("0", 5);
		lblMedia = new JLabel("La media es 0.0");
		
		txt1.addFocusListener(this);
		txt2.addFocusListener(this);
		txt3.addFocusListener(this);
		
		add(txt1);
		add(txt2);
		add(txt3);
		add(lblMedia);
		
		setVisible(true);
		
	}
	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
		
		try{
			double num1 = Double.parseDouble(txt1.getText());
			double num2 = Double.parseDouble(txt2.getText());
			double num3 = Double.parseDouble(txt3.getText());
		
			double media = (num1 + num2 + num3)/3;
		
			lblMedia.setText("La media es: " + media);
		
		
		}catch(NumberFormatException nfe){
			lblMedia.setText("Error numerico");
		}
	}
	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
