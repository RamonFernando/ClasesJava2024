package GUI;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionListener;

public class RepasoExamen extends JFrame {

	JButton btnBoton1;
		
	public static void main(String[] args) {
		// 
		new RepasoExamen();
	}
	public RepasoExamen(){
		super("ventana");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnBoton1 = new JButton("Boton");
		btnBoton1.setPreferredSize(new Dimension(100, 50)); // dimension del boton
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTexto = new JLabel("Esto es un texto",JLabel.RIGHT); // para que salga a la derecha.
		JTextArea txtaTexto = new JTextArea("Introduce texto",8,20); // Para crear un cuadrado de texto.
		JTextField txtfTexto = new JTextField("Introduce nombre",20); // Solo una linea de texto.
		JScrollPane ScpArea = new JScrollPane(txtaTexto); // para crear un Scroll (Barra que sube y baja).
		
		JCheckBox chcBotones1 = new JCheckBox("Botones1"); // Cuando se inicialice este seleccionado auto hay que poner true.
		JCheckBox chcBotones2 = new JCheckBox("Botones 2");
		JCheckBox chcBotones3 = new JCheckBox("Botones3");
		
		 ButtonGroup btnGrupo = new ButtonGroup(); // Esto es para crear un grupo de botones.
		 btnGrupo.add(chcBotones1);
		 btnGrupo.add(chcBotones2);
		 btnGrupo.add(chcBotones3);
		 
		 JSlider sldGrafic = new JSlider(JSlider.HORIZONTAL,0,100,20); // Para crear el volumen
		 sldGrafic.setMajorTickSpacing(20); // Para crear que salga de 20 en 20 o de 10 en 10
		 sldGrafic.setMinorTickSpacing(10); // Para crear las lineas menores
		 sldGrafic.setPaintTicks(true); // Para que se muestren las barras 
		 sldGrafic.setPaintLabels(true); // Para que se muestren los numeros
		 sldGrafic.setForeground(Color.blue);
		 
		 
		 
		 
		 
		 
		add(sldGrafic);
		add(chcBotones3);
		add(chcBotones2);
		add(chcBotones1);
		add(txtfTexto);
		add(ScpArea); // Sustituyo el nombre del txtaTexto por ScpArea.
		add(btnBoton1);
		add(lblTexto);
		
		setVisible(true);
	}
	
}
