import java.util.Scanner;
/**
 * 
 * @author Ramon..
 *
 */
public class Arrays7 {

	public static void main(String[] args) {
		// 7.- Crea un array de 10 elementos de tipo double llamado notas. Ve
		// leyendo las diez notas desde la consola, mediante un bucle while, y
		// guardándolas en el array. A continuación, muestra las diez notas.
		Scanner entrada = new Scanner(System.in);
		
		double Notas [] = new double [10];
		
		
		
		Notas [0]=5.2;
		Notas [1]=4.7;
		Notas [2]=6.8;
		Notas [3]=7;
		Notas [4]=6.6;
		Notas [5]=8;
		Notas [6]=9;
		Notas [7]=5.5;
		Notas [8]=7.25;
		Notas [9]=8.25;
		
		System.out.println("Notas de alumnos: \n <<<<<<<>>>>>>>");
		int i= 0;
		while(i<Notas.length){
			System.out.println(Notas[i]);
			i++;
		}
		
		entrada.close();
	}

}
