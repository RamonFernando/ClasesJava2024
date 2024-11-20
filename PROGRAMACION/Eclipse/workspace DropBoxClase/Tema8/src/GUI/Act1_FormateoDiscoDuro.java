package GUI;

import javax.swing.*;

public class Act1_FormateoDiscoDuro extends JFrame {

	public static void main(String[] args) {
		// Crea un panel de diálogo con la siguiente apariencia:

		JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?", "Confirmación de formateo",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

	}

}
