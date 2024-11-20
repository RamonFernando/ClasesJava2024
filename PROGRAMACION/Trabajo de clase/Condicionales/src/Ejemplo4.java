import java.util.Scanner;


public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//preguntamos un precio y si es mayor de 
		//40 escribimos en pantalla "Tiene  
		// derecho a premio" y si no "Siga comprando"
		Scanner teclado = new Scanner (System.in);
		double precio;
		
		//Preguntamos el precio
		System.out.println("Precio del producto: ");
		precio = teclado.nextDouble();
		//Miramos si el precio es mayor de 40 o no.
		if(precio>40)
		{
			System.out.println("Tiene derecho a premio.");
		}
		else 
		{
			System.out.println("Siga comprando. ");
			
		}
		 
		{
			System.out.println("Gracias por su compra. Vuelva pronto!! ");
			
		}
		
	
	
	}

}
