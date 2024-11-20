
public class Arrays5 {

	public static void main(String[] args) {
		// 5.- Crea un array llamado notas con cinco posiciones y ve asignando a
		// cada una de ellas el valor de un examen que hayas hecho este curso
		// (no sólo de programación). Haz que después se muestren todos los
		// valores mediante un bucle while.
		
		double Notas[] = new double [5];
		
		Notas[0]=4.5;
		Notas[1]=5.2;
		Notas[2]=3.7;
		Notas[3]=8.75;
		Notas[4]=6.8;
		
		System.out.println("Notas de mi curso: \n******************");
		int i=0;
		while(i<Notas.length){
			System.out.println(Notas[i]);
			i++;
		}
		
		

	}

}
