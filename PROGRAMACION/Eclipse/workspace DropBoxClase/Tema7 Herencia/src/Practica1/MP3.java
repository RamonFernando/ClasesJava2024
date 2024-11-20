package Practica1;

public class MP3 extends Musica implements Guardable{

	private int modo;

	public MP3(int  id, String nombre, double duracion, String artista, String estilo, 
			int modo){
		
		super(id, nombre, duracion, artista, estilo);
		this.modo = modo;
		
	}
	
	@Override
	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}
	
	@Override
	public String toString(){
		
		return getId() + " " + getNombre();
		
	}
	
	
}
