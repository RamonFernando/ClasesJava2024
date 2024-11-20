package Geometria;
/**
 * 
 * @author Ramon.
 *
 */
import Geometria.Cilindro;
public class Cilindro {
	
	
	double altura;
	double radio;
	double PI = 3.141592;
	double Area;
	double Volumen;
	
	Cilindro(){
		
	}
	public Cilindro( double altura, double radio, double PI){
		this.altura= altura;
		this.radio= radio;
		this.PI= PI;
	}
	void setaltura(double altura){
		this.altura = altura;
	}
	double getaltura(){
		return altura;
	}
	void setradio(double radio){
		this.radio=radio;
	}
	double getCilindro(double radio){
		return radio;
	}
	void setArea(double Area){
	this.Area=Area;
	}
	double getArea(){
		return Area;
	}
	void setVolumen(double Volumen){
		this.Volumen=Volumen;
	}
	double getVolumen(){
		return Volumen;
	}
}
