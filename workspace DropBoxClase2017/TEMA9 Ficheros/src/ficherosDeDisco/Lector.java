package ficherosDeDisco;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Lector extends JFrame implements ActionListener {

	private JTextArea txtContenido;
	private JScrollPane panelBarras;

	public Lector() {
		super("Lector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 200);

		setLayout(new GridLayout(1, 1));

		txtContenido = new JTextArea();
		panelBarras = new JScrollPane(txtContenido);

		JMenuItem itemAbrir = new JMenuItem("Abrir");

		itemAbrir.addActionListener(this);

		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.add(itemAbrir);

		JMenuBar menu = new JMenuBar();
		menu.add(menuArchivo);

		setJMenuBar(menu);
		add(panelBarras);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Lector();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Averiguamos el nombre del archivo a abrir.
		JFileChooser elegir = new JFileChooser();

		int resultado = elegir.showOpenDialog(null);

		if (resultado != JFileChooser.APPROVE_OPTION)
			return;

		File archivo = elegir.getSelectedFile();

		txtContenido.setText("");

		// Ahora debemos abrir el archivo y leer el contenido.
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			String linea = "";
			boolean eof = false;

			while (!eof) {
				linea = br.readLine();
				if (linea == null)
					eof = true;
				else
					txtContenido.append(linea + "\n");
			}

			br.close();
		} catch (IOException ioe) {
			System.out.println("Error de E/S: " + e.toString());
		}
	}
}
