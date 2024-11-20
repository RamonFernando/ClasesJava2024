public class Baraja {

	private Carta[] cartas = new Carta[52];

	public Baraja() {

		ordenar();

	}

	public void mostrar() {

		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i].toString());
		}

	}

	public void ordenar() {
		int posicion = 0;

		for (int i = 0; i <= 3; i++) {

			for (int j = 1; j <= 13; j++) {
				cartas[posicion] = new Carta(j, i);
				posicion++;
			}

		}
	}

	public void extraer() {
		System.out.println("Has sacado el " + cartas[0]);
	}

	public void barajar() {

		int pos1, pos2;
		Carta aux;

		for (int i = 1; i <= 100; i++) {

			pos1 = (int) Math.random() * 52;
			pos2 = (int) Math.random() * 52;

			aux = cartas[pos1];
			cartas[pos1] = cartas[pos2];
			cartas[pos2] = aux;
		}
	}

}