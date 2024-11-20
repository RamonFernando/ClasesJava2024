package Ejemplo2;

public class Main {

	public static void main(String[] args) {
		// Si no tiene nombre la clase hereda de la clase Objet.
		
//		Vehiculo V1 = new Vehiculo();
//		V1.matricula = "6430MXL";
//		V1.marca = "Renault";
//		V1.modelo = "Megan";
//		System.out.println(V1.Mostrar());
//		V1.Mostrar();
//		
//		Coche C1 = new Coche();
//		C1.marca = "Ferrari";
//		C1.matricula = "5620MXL";
//		C1.modelo = "Enzo";
//		C1.setNumPuertas(5);
//		System.out.println(C1.Mostrar());
//		C1.Mostrar();
//		
//		Moto M1 = new Moto();
//		M1.matricula = "5230MLX";
//		M1.marca = "MZ";
//		M1.modelo = "320";
//		M1.setTieneSidecar(true);
//		System.out.println(M1.Mostrar());
//		M1.Mostrar();
		
		Vehiculo V;
		V =  new Coche();
		System.out.println(V.Mostrar());
		

	}
	public static void Mostrar(Vehiculo c){
		System.out.println(c.Mostrar());
		Mostrar(c);
		
		Moto m = new Moto();
		Mostrar(m);
	}
	public static void mostrar(Vehiculo v){
		System.out.println(v.Mostrar());
	}
}
