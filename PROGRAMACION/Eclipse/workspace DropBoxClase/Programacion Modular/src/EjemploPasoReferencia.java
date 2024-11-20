
public class EjemploPasoReferencia {

	public static void main(String[] args) {
		// 
		String [] colores = {"rojo","verde", "magenta", "amarillo"};
		muestraColores(colores);
		System.out.println("El tercer color del array colores es " + colores[2]);

	}
	static void muestraColores(String[] c){
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	//Cambiamos un valor del array
	c[2] = "verde";
	System.out.println("El tercer color del array c es " + c[2]);
	}
}
