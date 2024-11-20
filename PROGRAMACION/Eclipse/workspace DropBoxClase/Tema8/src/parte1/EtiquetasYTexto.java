package parte1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class EtiquetasYTexto extends JFrame {

	public static void main(String[] args) {
		
		EtiquetasYTexto ventana = new EtiquetasYTexto(); // Aqui se añade el constructor.
		
		
	}
	public EtiquetasYTexto(){
		super("Etiquetas");
		// setSize(400,100); // Aqui se le da el tamaño al boton
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lblPagina = new JLabel("Direccion de la pagina web:");
		
		JTextField txtPagina = new JTextField("Escribe aqui...",30);
		
		add(lblPagina);
		add(txtPagina);
		
		pack();
		setVisible(true); // Aqui se le dice al boton que este en visible.
		
	}
}
