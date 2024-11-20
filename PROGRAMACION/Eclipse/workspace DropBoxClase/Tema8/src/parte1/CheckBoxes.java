package parte1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CheckBoxes extends JFrame {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}
	public CheckBoxes(){
		super("CheckBoxes");
		setSize(350,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JCheckBox chkOption1 = new JCheckBox("Coche",true);
		JCheckBox chkOption2 = new JCheckBox("Moto",false);
		JCheckBox chkOption3 = new JCheckBox("Autobus",false);
		JCheckBox chkOption4 = new JCheckBox("Camion", false);
		
		ButtonGroup grupoBotones = new ButtonGroup();
		grupoBotones.add(chkOption1);
		grupoBotones.add(chkOption2);
		grupoBotones.add(chkOption3);
		grupoBotones.add(chkOption4);
		
		
		
		add(chkOption1);
		add(chkOption2);
		add(chkOption3);
		add(chkOption4);
		
	}
}
