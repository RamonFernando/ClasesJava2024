package HerenciaT7;

public class Main {

	public static void main(String[] args) {
		// 
		
//		Persona p = new Persona();
//		p.setNombre("Carlos");
//		p.setApellidos("Sgort");
//		p.setDni("87128162S");
		
//		p.mostrar();
		
		Cliente c = new Cliente();
		c.setNombre("Ramon");
		c.setApellidos("Perez");
		c.setDni("Y1059197S");
		c.setVisa("8090554030200017");
		
		c.mostrar();
		
		Empleado e = new Empleado();
		e.setNombre("Alberto");
		e.setApellidos("Cabobt");
		e.setDni("88603090T");
		e.getCategoriaEmpleado();
		e.mostrar();
	
	
		Persona p1;
		p1 = new Cliente();
		
		//		p1.saludar();
		
		((Cliente)p1).saludar();
		
		Persona p2 = new Persona();
		p2.setDni("809055403020001Y");
		p2.setNombre("Pepe");
		p2.setApellidos("Zuñiga");
		
		System.out.println(p1.equals(p2));
	
	}

}
