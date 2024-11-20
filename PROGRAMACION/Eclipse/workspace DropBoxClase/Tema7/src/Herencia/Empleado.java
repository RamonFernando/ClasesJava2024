package Herencia;

public class Empleado extends Persona {

	private int categoriaEmpleado;

	public int getCategoriaEmpleado() {
		return categoriaEmpleado;
	}

	public void setCategoriaEmpleado(int categoriaEmpleado) {
		this.categoriaEmpleado = categoriaEmpleado;
	}

	
	public void mostrar() {
		super.mostrar();
		System.out.println("Categoría de empleado: " + categoriaEmpleado);
	}
}