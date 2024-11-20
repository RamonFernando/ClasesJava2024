package Excepciones;

public class exceptiones {
	public static void main(String[] args) {
		
		String dividendo = "20";
		String divisor = "pe";
		int resultado = 0;
	
		try{
			int a = Integer.parseInt(dividendo);
			int b = Integer.parseInt(divisor);		
			resultado = a/b;		
			
			System.out.println("La division da " + resultado);
		
		}catch(Exception e){
			
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		//		int numero = 0;
//
//		try {
//			numero = Integer.parseInt(entrada);
//			System.out.println(numero);
//
//		} catch (Exception e) {
//
//			System.out.println("Lo que has introducido no es un numero.");
//		}
//
	}
}
