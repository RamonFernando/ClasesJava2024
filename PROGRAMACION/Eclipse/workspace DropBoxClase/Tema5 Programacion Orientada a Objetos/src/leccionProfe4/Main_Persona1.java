
package leccionProfe4;

/**
 * 
 * @author Ramon.
 * 
 *         (Paso de programacion estructurada a la programacion orientada a
 *         objetos.)
 *
 */
public class Main_Persona1 {

	public static void main(String[] args) {
		// Programación orientada a objetos.
		Persona1 p = new Persona1("22091173T", "Pepe", " Sánchez", 30, 90);

		System.out.println(p.getDni());

		p.setDni("100120912U");

		System.out.println(p.getDni());

		p.setNombre("Romeo");
		p.setApellidos("Santos");
		System.out.println(p.getNombre());
		System.out.println(p.getApellidos());

	}
}