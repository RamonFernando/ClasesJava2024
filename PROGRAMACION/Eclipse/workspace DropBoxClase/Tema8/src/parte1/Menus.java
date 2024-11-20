package parte1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menus extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menus();
		
	}
	public Menus(){
		super("Menus");
		setSize(300,175);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JMenuItem itemAbrir = new JMenuItem("Abrir");
		JMenuItem itemCerrar = new JMenuItem("Cerrar");
		JMenuItem itemGuardar = new JMenuItem("Guardar");
		JMenuItem itemGuardarComo = new JMenuItem("Guardar como...");
		
		JMenuItem itemDeshacer = new JMenuItem("Deshacer");          // Deshacer reacer cortar copiar pegar
		JMenuItem itemRehacer = new JMenuItem("Rehacer");
		JMenuItem itemCortar = new JMenuItem("Cortar");
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		JMenuItem itemPegar = new JMenuItem("Pegar");
		
		JMenu menuArchivo = new JMenu("Archivo");
		
		menuArchivo.add(itemAbrir);
		menuArchivo.add(itemCerrar);
		menuArchivo.add(itemGuardar);
		menuArchivo.add(itemGuardarComo);
		
		JMenu menuEditar = new JMenu("Editar");
		menuEditar.add(itemDeshacer);
		menuEditar.add(itemRehacer);
		menuEditar.add(itemCortar);
		menuEditar.add(itemCopiar);
		menuEditar.add(itemPegar);
		
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEditar);
		setJMenuBar(barraMenu);
		setVisible(true);
		
	}
}
