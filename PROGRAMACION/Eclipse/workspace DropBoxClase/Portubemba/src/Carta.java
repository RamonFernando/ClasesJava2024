import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Carta {

	// POO = Pasos.
	// 1. Se crean los atributos.
	// 2. Se crea un constructor.
	// 3. Se crean los Get y los set.
	// 4.

	// Ahora se declaran los atributos
	// Atributos
	private int valor;
	private int palo;

	// Aqui se declara el constructor con el parametro valor y palo.
	public Carta(int valor, int palo) {
		this.valor = valor;
		this.palo = palo;

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
	// Ahora se declara un metodo.
	// Añadiremos un método compara( ) que toma como parámetro otro objeto de
	// tipo Carta y devuelve
	// true si tienen el mismo valor y palo o false en caso contrario.

	public boolean compara(Carta otraCarta) {

		if (this.valor == otraCarta.getValor() && this.palo == otraCarta.getPalo()) {
			return true;
		}
		return false;
	}

	// El metodo toString nos permite mostrar la informacion completa de un
	// objeto , es decir el valor de sus atributos.
	public String toString() {
		String value = "";
		String value_carta="";
		switch (palo) {
		
		case 0:
			value = "Diamante";
		break;	
		
		case 1:
			value = "Corazones";
		break;
		
		case 2:
			value = "Picas";
		break;
		
		case 3:
			value = "Treboles";
		break;	
		}
		
		if (valor == 11){
			value_carta = "Jota";
		}
		if (valor == 12){
			value_carta = "Reina";
		}
		if (valor == 13){
			value_carta = "Rey";
		}
		if (valor > 10){
			return value_carta + " de " + value;
		}
			return valor + " de " + value;
		// return (valor > 10? value_carta: valor) + " de " + value;
		
	}
	
}
