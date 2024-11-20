
package Leccion1;

/**
 * 
 * @author Ramon.
 * 
 *         (Paso de programacion estructurada a la programacion orientada a
 *         objetos.)
 *
 */
public class Main_Persona {

	public static void main(String[] args) {
		// Programación orientada a objetos.

		int num;
		Persona1 p; // Declarar una variable
		p = new Persona1(); // Crear un objeto persona y asignarlo a p.

		p.dni = "20110289T";
		p.nombre = "Pepe";
		p.apellidos = "Martinez Ruiz";
		p.peso = 70;
		p.edad = 25;

		Persona1 cliente = new Persona1();
		cliente.dni = "829912021U";
		cliente.nombre = "Pablo";
		cliente.apellidos = "Menéndez Pérez";
		cliente.peso = 90;
		cliente.edad = 70;

		p.mostrar();
		cliente.mostrar();
		cliente.saludar();
		cliente.cumpleAnyos();

		System.out.println("Llega el cumpleaños del cliente ....");
		System.out.println("Ahora el cliente tiene " + cliente.edad + " años");
		
		System.out.println("La edad del cliente es " + cliente.getEdad() + " años");
	
	
		Persona1 p4 = new Persona1("Carlos", "Sogorb");
		p4.mostrar();
	}
}
