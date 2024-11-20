package Algebra;

public class Polinomio {
	
	private double[] coeficiente;
	
	public Polinomio(int grado){
		coeficiente = new double[grado];
	}
	public Polinomio(double[] coefs){
		coeficiente = coefs;
	}
	public int getGrado(){
		return coeficiente.length-1;
	}
	public double evaluar (double n){
		double resultado = coeficiente[0];
		for (int i = 0; i < coeficiente.length; i++) {
			resultado = resultado + coeficiente[i]*Math.pow(n, i);
		}
		return resultado;
	}
	public Polinomio sumar(Polinomio q){
		double[] coeficienteQ = q.getCoeficiente();
		double[] coeficienteSuma = new double [q.getGrado()+1];
		
		for (int i = 0; i < coeficienteSuma.length; i++) {
			coeficienteSuma[i] = coeficienteQ[i] + coeficienteQ[i];
		}
		return new Polinomio(coeficienteSuma);
	}
	
	
	public Polinomio Resta(Polinomio q){
		double[] coeficienteQ = q.getCoeficiente();
		double[] coeficienteResta = new double [q.getGrado()+1];
		
		for (int i = 0; i < coeficienteResta.length; i++) {
			coeficienteResta[i] = coeficienteQ[i] - coeficienteQ[i];
		}
		return new Polinomio(coeficienteResta);
	}
	
	public String toString(){
		String poli = "" + coeficiente[0];
		for (int i = 0; i < coeficiente.length; i++) {
			if (coeficiente[i]<0){
				poli = poli + coeficiente[i] + " x^ " + i;
			}else{
				poli = poli + " + " + coeficiente[i] + " x^" + i;
			}
			
		}
		return poli;
	}
	public void setCoeficiente(double[] coeficiente) {
		this.coeficiente = coeficiente;
	}
	public double [] getCoeficiente(){
		return coeficiente;
	}
}
