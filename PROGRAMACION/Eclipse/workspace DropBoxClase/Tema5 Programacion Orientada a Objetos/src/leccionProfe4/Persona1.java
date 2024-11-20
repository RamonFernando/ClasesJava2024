package leccionProfe4;

/**
 * 
 * @author Ramon.
 *
 */
public class Persona1 {

	// Atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private double peso;
	private String dni;
	private String color;
	private String sexo;
	
	// Metodo Constructor.
	
	 Persona1(){
		
	}
		Persona1(String dni,String nombre, String apellidos, int edad, double peso){
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;
			this.peso = peso;
			
		
	}	
		Persona1(String nombre, String apellidos){
			this("00000000A",nombre, apellidos,18,70);
			
		}
		
	// Metodos.
	void mostrar() {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Años: " + edad);
		System.out.println("Peso: " + peso);

	}

	void saludar() {
		System.out.println("Hola soy " + nombre + ".");

	}

	// El cliente cumpla un año.
	void cumpleAnyos() {
		edad++;
	}

	// Metodo que devuelva la edad de la persona.
	// Hay un convenio en el que cuando se devuelve algun atributo se utiliza la
	// palabra get(obtener).
	// Para refactorizar es ( Mayus Alt r )
	int getEdad() {
		return edad;
	}
	// Metodos de acceso.
	String getDni(){
		return dni;
	}
	void setDni(String dni){
		this.dni = dni;
	}
	String getNombre(){
		return nombre;
	}
	void setNombre(String nombre){
		this.nombre = nombre;
	}
	String getApellidos(){
		return apellidos;
	}
	void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
}