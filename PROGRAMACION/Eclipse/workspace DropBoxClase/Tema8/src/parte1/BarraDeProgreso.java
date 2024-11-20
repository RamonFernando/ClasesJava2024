package parte1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BarraDeProgreso extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BarraDeProgreso();
	}
	public BarraDeProgreso(){
		super("Nivel del deposito");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JProgressBar pgrCombustible = new JProgressBar(0,50);
		
		pgrCombustible.setValue(20);
		pgrCombustible.setStringPainted(true);
		pgrCombustible.setForeground(Color.CYAN); // Color de fondo de barra que se esta cargando
		pgrCombustible.setFont(getFont()); // Tipo de letra
		pgrCombustible.setBackground(Color.GREEN); // Color de fondo de barra que falta por cargarse
		getContentPane().setBackground(Color.LIGHT_GRAY);
		add(pgrCombustible);
		setVisible(true);
	}
}
