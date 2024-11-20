
public class Arrays2 {

	public static void main(String[] args) {
		// 2.- Crea un array de Strings llamado meses cuyos valores sean los
		// nombres de los doce meses del año. Haz que después se muestren todos
		// los valores mediante un bucle while.

		String meses[] = new String[12];

		meses[0] = "enero";
		meses[1] = "febrero";
		meses[2] = "marzo";
		meses[3] = "abril";
		meses[4] = "mayo";
		meses[5] = "junio";
		meses[6] = "julio";
		meses[7] = "agosto";
		meses[8] = "septiembre";
		meses[9] = "octubre";
		meses[10] = "noviembre";
		meses[11] = "diciembre";
		
		System.out.println("Meses del año:" + "\n==============");
		int i=0;
		while (i < 12) {
			System.out.println(meses[i]);
			i++;
		}
	}

}
