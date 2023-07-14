public class Rectangulo implements Poligono {

	private double lado1, lado2;
	public Rectangulo(double dato1, double dato2) {
		lado1 = dato1;
		lado2 = dato2;
	}
	public double area() {
		return lado1 * lado2;
	}
	public double perimetro(){
		return lado1 * 2 +  lado2 * 2;
	}
	public void cambiarValores(double dato1, double dato2) {
		lado1 = dato1;
		lado2 = dato2;
	}
	public double getLado1(){
		return lado1;
	}
	public double getLado2(){
		return lado2;
	}

}