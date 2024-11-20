import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int precio, preciofinal;
		Scanner teclado = new Scanner (System.in);
		
		// Leemos precio
		System.out.println("Precio: ");
		precio = teclado.nextInt();
		
		if(precio>=80){
			preciofinal = precio*10/100;
			
		System.out.println("Preciofinal: " + preciofinal);}
		
		if(precio<80){
			System.out.println("Usted no tiene descuento. ");
			teclado.close();
			
		}	
		}
	}
		
		
		
		
		
		
		
	


