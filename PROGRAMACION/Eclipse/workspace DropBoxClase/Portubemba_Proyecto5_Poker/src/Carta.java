
public class Carta {

	//Atributos 
	private int valor;
	private int palo;
	
	//Constructor
	public Carta(int valor, int palo){
		this.valor=valor;
		this.palo=palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getpalo(){
		return palo;
	}
	public void setpalo(int palo){
		this.palo=palo;
	}
	public boolean compara(Carta otraCarta){
		if(this.valor == otraCarta.valor && this.palo == otraCarta.palo){
			return true;
		}
			return false;
	}
	public String toString(){
		
		String tipoB = "";
		
		switch (palo){
		
		case 0:
			tipoB = "Diamantes";
		break;
		
		case 1:
			tipoB = "Corazones";
		break;	
		
		case 2:
			tipoB = "Picas";
		break;
		
		case 3:
			tipoB = "Treboles";
		break;
		
		}
		
		
		return "Valor:" + valor + " Palo: " + tipoB;
	
	}

}
