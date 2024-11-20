
public class Baraja {

	// POO = Pasos.
	// 1. Se crean los atributos.
	// 2. Se crea un constructor y metodos.
	// 3. Se crean los Get y los set.

	private Carta cartas[] = new Carta[52];

	// Metodos (Modificador, tipo de valor, nombre_del_metodo y Parametro
	// (tipo_valor parametro_nombre))
	
	// Este es el constructor de la clase baraja.
	public Baraja() {
		ordenar();
	}
	
	//Aqui se crean los metodos.
	// En metodo main se le llama miBaraja.Mostrar();
	public void mostrar(){
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i].toString());
		}
	}
	
	public void ordenar() {
			int contador = 0;
			for (int i = 0; i <= 3; i++) {
				for (int j = 0; j < 13; j++) {
					cartas[contador]= new Carta(j,i);
					contador++;
				}
			}
			
		}
	public void extraer(){
		System.out.println("Has sacado el " + cartas[1]);
	}
	public void barajar(){
		int pos1;
		int pos2;
		Carta aux;
		
		for (int i = 0; i < cartas.length; i++) {
			pos1=(int)Math.random()*52;
			pos2=(int)Math.random()*52;
			
			aux=cartas[pos1];
			cartas[pos1] = cartas[pos2];
			cartas[pos2] = aux;
		}
		
	}
}
