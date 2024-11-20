package parte1;

import javax.swing.*;
import java.awt.*;

public class Sliders extends JFrame {

	public static void main(String[] args) {

		Sliders ventana = new Sliders();

	}

	public Sliders() {

		super("Sliders");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JSlider sldDeslizador = new JSlider(JSlider.VERTICAL, -50, 50, -50);
		sldDeslizador.setMajorTickSpacing(20);
		sldDeslizador.setMinorTickSpacing(1);
		sldDeslizador.setPaintLabels(true);
		sldDeslizador.setPaintTicks(true);
		sldDeslizador.setPreferredSize(new Dimension(100, 300));

		add(sldDeslizador);

		setVisible(true);

	}

}