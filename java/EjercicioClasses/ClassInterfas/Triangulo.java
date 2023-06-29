public class Triangulo implements Poligono {

	private double tipo,lado1,lado2,lado3;
	public Triangulo(double tipo, double dato1, double dato2, double dato3) {
		lado1 = dato1;
		lado2 = dato2;
		lado3 = dato3;
	}
	public void cambiarDatos(double tipo, double dato1, double dato2, double dato3) {
		lado1 = dato1;
		lado2 = dato2;
		lado3 = dato3;
	}
	public double getLado1() {
		return lado1
	}
	public double getLado2(){
		return lado2
	}
	public double getLado3(){
		return lado3
	}
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
	}

}