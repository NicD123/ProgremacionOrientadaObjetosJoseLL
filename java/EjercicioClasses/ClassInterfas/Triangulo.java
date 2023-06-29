import java.util.*;
public class Triangulo implements Poligono {

	private double tipo,lado1,lado2,lado3;
	public Triangulo(double dtipo, double dato1, double dato2, double dato3) {
		tipo = dtipo;
		lado1 = dato1;
		lado2 = dato2;
		lado3 = dato3;
	}

	public Triangulo(double tipo, double dato1, double dato2) {
		tipo = dtipo;
		lado1 = dato1;
		lado2 = dato2;
	}


	public double area() {
	int perimetro2 = this.perimetro()/2;
		switch (tipo) { 
    			case 1:
				return lado1*lado2/2
    				break;
    			case 2:
				return Math.sqrt(perimetro2 * ( perimetro2 - lado1) * ( perimetro2 - lado2) * ( perimetro2 - lado3) );
				break;
    			case 3:
				return (lado2 / 4 ) * Math.sqrt((4* lado1 * lado1) - (lado2 * lado2 ));
				break;
    			default:
				break;
 		 }
	}
	public double perimetro(){
		switch (tipo) { 
    			case 1:
				return lado1*3
    				break;
    			case 2:
				return lado1 +lado2 +lado3
				break;
    			case 3:
				return lado1*2 +lado3
				break;
    			default:
				break;
		}
	}
	public void cambiarDatos(double dtipo, double dato1, double dato2, double dato3) {
		tipo = dtipo;
		lado1 = dato1;
		lado2 = dato2;
		lado3 = dato3;
	};

	public void cambiarDatos(double dtipo, double dato1, double dato2) {
		tipo = dtipo;
		lado1 = dato1;
		lado2 = dato2;
	};

	public double getLado1() {
		return lado1
	};
	public double getLado2(){
		return lado2
	};
	public double getLado3(){
		return lado3
	};
	public string getTipo(){
		switch (tipo) { 
    			case 1:
				return "Equilatero"
    				break;
    			case 2:
				return "Escaleno"
				break;
    			case 3:
				return "Isoseles"
				break;
    			default:
				break;
 		 }
	};

}