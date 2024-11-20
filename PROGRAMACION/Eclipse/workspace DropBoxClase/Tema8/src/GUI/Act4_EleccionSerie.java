package GUI;

import javax.swing.*;

public class Act4_EleccionSerie extends JFrame {

	public static void main(String[] args) {
		// Crea un panel de diálogo con la siguiente apariencia:

		String[] opciones = { "Futurama", "Los Simpson", "Héroes" };
		JOptionPane.showOptionDialog(null, "Haz clic en tu serie favorita", "Elección de serie", 0,
				JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[2]);

	}

}
