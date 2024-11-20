package Herencia;

public class Main {
	public static void main(String[] args) {

		Persona p = new Persona();

		p.setNombre("Carlos");
		p.setApellidos("Sogorb");
		p.setDni("87128162T");

		p.mostrar();

		// Cliente c = new Cliente();
		// c.setNombre("Pepe");
		// c.setApellidos("García");
		// c.setDni("27263572H");
		// c.setVisa("6251-6127-1211-1213");
		// c.mostrar();

		Empleado e = new Empleado();
		e.setDni("2328392");
		e.setNombre("Pablo");
		e.setApellidos("Sánchez");
		e.setCategoriaEmpleado(1);
		e.mostrar();
	}
}