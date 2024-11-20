package GUI;

import javax.swing.*;

public class Act3_AlertaSeguridad extends JFrame {

	public static void main(String[] args) {
		// Crea un panel de diálogo con la siguiente apariencia:

		JOptionPane.showMessageDialog(null, "Se ha detectado un escaneo de red desde la IP 192.168.1.51.",
				"Alerta de seguridad", JOptionPane.WARNING_MESSAGE);

	}

}
