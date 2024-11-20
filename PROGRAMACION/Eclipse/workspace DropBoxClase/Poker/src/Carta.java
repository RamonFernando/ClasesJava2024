
public class Carta {

	private int valor;
	private int palo;

	public Carta(int valor, int palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public boolean compara(Carta carta) {

		if (valor == carta.valor && palo == carta.palo) {
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		String paloNombre = "";

		switch (palo) {
		case 0:
			paloNombre = "Diamantes";
			break;
		case 1:
			paloNombre = "Corazones";
			break;
		case 2:
			paloNombre = "Picas";
			break;
		case 3:
			paloNombre = "Tréboles";
			break;
		}

		return valor + " de " + paloNombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}
	
	
	
	
	
	
	
	
	

}
