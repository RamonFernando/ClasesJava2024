package GUI;

import javax.swing.*;

public class Atc5_EleccionServidorWeb extends JFrame {

	public static void main(String[] args) {
		// Crea un panel de diálogo con la siguiente apariencia:

		String[] elecciones = { "Apache", "IIS", "Nginx", "Node.JS" };
		JOptionPane.showOptionDialog(null, "¿Qué servidor web desea para su hosting?", "Elección de servidor web", 0,
				JOptionPane.INFORMATION_MESSAGE, null, elecciones, elecciones[1]);

	}

}
