
public class Baraja {

	Carta barajas [] = new Carta[52];
	
	//Constructor 
	Baraja(){
	}
	
	// Metodos
	public void ordenar(){
		int num1;
		int num2;
		int contador = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 13; j++) {
				barajas[contador] = new Carta(j,i);
				contador++;
			}
		}
	}
	public 	void barajar(){
		int pos1,pos2,aux;
		for (int i = 0; i < barajas.length; i++) {
			
		}
	}
	public void cortar(){
		
	}
	public void extraer(){
		System.out.println("Usted ha a sacado: " + barajas[7]);
	}
	public void mostrar(){
		for (int i = 0; i < barajas.length; i++) {
			System.out.println(barajas[i]);
		}
		
	}
}
