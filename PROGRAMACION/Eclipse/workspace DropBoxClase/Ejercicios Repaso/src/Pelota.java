
public class Pelota {

	// Atributos
	private String color;
	private int peso;
	
	// Constructor
	public Pelota(){
		
	}
	public Pelota(String color, int peso){
		this.setColor(color);
		this.setPeso(peso);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String toString(){
		return "color: " + color + ", " + " peso: " + peso;
	}
	
}
