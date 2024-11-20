package parte1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ComboBoxes extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ComboBoxes comboBoxes = new ComboBoxes();
		new ComboBoxes(); // Esto es si no vamos a utilizar el objeto lo creamos asi.
		
	}
	public ComboBoxes(){
		super("Elige un vehiculo");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JComboBox<String> desplegable = new JComboBox<>();
		desplegable.addItem("Coche");
		desplegable.addItem("Moto");
		desplegable.addItem("Autobus");
		desplegable.addItem("Camion");
		
		add(desplegable);
		
		setVisible(true);
		
	}
	
}
