package Practica1;

public class Biblioteca {

	private MP3[] biblioteca = new MP3[1000];

	public int primeraCancion() {

		int posMin = 0;

		for (int i = 1; i < biblioteca.length; i++) {

			if (biblioteca[i] != null && biblioteca[i].getNombre().compareTo(biblioteca[posMin].getNombre()) < 0) {

				posMin = i;

			}

		}

		return posMin;

	}

	public boolean addSong(MP3 cancion) {

		for (int i = 0; i < biblioteca.length; i++) {

			if (biblioteca[i] == null) {
				biblioteca[i] = cancion;
				System.out.println("Introducimos el archivo en la posición " + i);
				return true;
			}

		}

		return false;

	}

	public MP3 getSong(int id) {

		for (int i = 0; i < biblioteca.length; i++) {

			if (biblioteca[i].getId() == id) {

				System.out.println("Devuelta la canción en la posición " + i);
				return biblioteca[i];

			}

		}

		return null;
	}

	public boolean update(MP3 m, int pos) {

		if (pos >= 0 && pos < biblioteca.length) {
			biblioteca[pos] = m;
			return true;
		} else {
			return false;
		}

	}

	public boolean delete(int id) {

		for (int i = 0; i < biblioteca.length; i++) {

			if (biblioteca[i].getId() == id) {

				biblioteca[i] = null;
				return true;

			}

		}

		return false;

	}

	public int busqueda(String nombre) {

		for (int i = 0; i < biblioteca.length; i++) {

			if (biblioteca[i] != null && biblioteca[i].getNombre().equals(nombre)) {
				return i;
			}

		}

		return -1;

	}

	public void mostrar() {

		for (int i = 0; i < biblioteca.length; i++) {

			if (biblioteca[i] != null) {

				System.out.println(i + " " + biblioteca[i].toString());

			}

		}

	}

	public void ordenar() {

		MP3 aux;

		for (int i = 0; i < biblioteca.length; i++) {

			if (biblioteca[i] == null) {
				continue;
			}
			
			for (int j = i + 1; j < biblioteca.length; j++) {

				if (biblioteca[j] == null) {
					continue;
				}

				if (biblioteca[j].getNombre()
						.compareTo(biblioteca[i].getNombre()) < 0) {
					aux = biblioteca[i];
					biblioteca[i] = biblioteca[j];
					biblioteca[j] = aux;
				}
			}
		}
	}
}
