public class Cubo extends Cuadrado {
	public Cubo() {
		super();
	};
	public double volumen()  {
		return area() * getLado();
	}
	
};