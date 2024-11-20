package Ejemplo2;

public class Moto extends Vehiculo {
	
	// INFO: Una clase abstracta es la que cuando lo pones no puedes instanciar
	// ningun objeto con ese nombre.
	// Para escribir una clase abstracta se escribe con cursiva.
	
	private boolean tieneSidecar;

	public boolean isTieneSidecar() {
		return tieneSidecar;
	}

	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}

	public String Mostrar() {
		return super.Mostrar() + " Tiene sidecar?: " + tieneSidecar;
	}

}
