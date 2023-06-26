public class Cuadrado{
	public Cuadrado() {};
	public double perimetro() {
		return lado * 4;
	};
	public double area() {
		return lado * lado;
	};
	public double getLado() {
		return lado;
	};
	public void setLado(double tam) {
		this.lado = tam;
	};

	private double lado;
};