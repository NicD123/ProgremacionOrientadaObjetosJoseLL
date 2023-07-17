import java.util.*;
public class Triangulo implements Poligono {
    
        private int tipo;
	private double lado1,lado2,lado3;
	public Triangulo(int dtipo, double dato1, double dato2, double dato3) {
		tipo = dtipo;
		lado1 = dato1;
		lado2 = dato2;
		lado3 = dato3;
	}

	public Triangulo(int dtipo, double dato1, double dato2) {
		tipo = dtipo;
		lado1 = dato1;
		lado2 = dato2;
	}
        
        public Triangulo(){}


	public void cambiarDatos(int dtipo, double dato1, double dato2, double dato3) {
		tipo = dtipo;
		lado1 = dato1;
		lado2 = dato2;
		lado3 = dato3;
	};

	public void cambiarDatos(int dtipo, double dato1, double dato2) {
		tipo = dtipo;
		lado1 = dato1;
		lado2 = dato2;
	};

	public double getLado1() {
		return lado1;
	};
	public double getLado2(){
		return lado2;
	};
	public double getLado3(){
		return lado3;
	};
	public String getTipo(){
		switch (tipo) { 
    			case 1:
				return "Equilatero";
    			case 2:
				return "Escaleno";
    			case 3:
				return "Isoseles";
    			default:
                            return "";
 		 }
	}
        
        public double perimetro(){
            switch (tipo) { 
    		case 1:
                    return lado1*3;
    		case 2:
                    return lado1 +lado2 +lado3;
    		case 3:
                    return lado1*2 +lado3;
    		default:
                    return 0;
		}
	}
        public double area() {
            double perimetro2 = this.perimetro()/2;
		switch (tipo) { 
    			case 1:
				return lado1*lado2/2;
    			case 2:
				return Math.sqrt(perimetro2 * ( perimetro2 - lado1) * ( perimetro2 - lado2) * ( perimetro2 - lado3) );
    			case 3:
				return (lado2 / 4 ) * Math.sqrt((4* lado1 * lado1) - (lado2 * lado2 ));
    			default:
				return 0;
 		 }
	}


}