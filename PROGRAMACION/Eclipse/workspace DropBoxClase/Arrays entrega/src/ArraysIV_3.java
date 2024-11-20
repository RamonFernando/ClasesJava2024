/**
 * 
 * @author Ramon.
 *
 */
public class ArraysIV_3 {

 public static void main(String[] args) {

  double cotizaciones[] = { 47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 49.9, 48.05, 48.7 };
  double aux;
  
  for (int i = 0; i < cotizaciones.length; i++) {
   
	for (int j = i + 1; j < cotizaciones.length; j++) {
    if (cotizaciones[i] > cotizaciones[j]) {
     aux = cotizaciones[i];
     cotizaciones[i] = cotizaciones[j];
     cotizaciones[j] = aux;
    }
   }
  }
  System.out.println("Cotizaciones \n============");
  for (int k = 0; k < cotizaciones.length; k++) {
   System.out.println(cotizaciones[k]);
  }
  
 }

}