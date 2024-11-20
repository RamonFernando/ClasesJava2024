
public class POO {
	
	private String nombre;
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String newValue){
		nombre = newValue;
	}

	//modificador + tipodedato + nombre del metodo + (parametros)
	public static int primerMetodo(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POO programa = new POO();
		programa.setNombre("Ramon Fernando");
		
		System.out.println(programa.getNombre());
		
		System.out.println(POO.primerMetodo(12, 24));
	}

}
