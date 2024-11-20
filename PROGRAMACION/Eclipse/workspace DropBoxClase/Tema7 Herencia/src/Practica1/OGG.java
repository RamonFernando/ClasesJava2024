package Practica1;

public class OGG extends Musica implements Guardable{
	
	private int version;
	
	public OGG(int id, String nombre, double duracion, String artista, String estilo, 
			int version){
		
		super(id, nombre, duracion, artista, estilo);
		this.setVersion(version);
		
	}

	@Override
	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
