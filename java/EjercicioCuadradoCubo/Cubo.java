public class Cubo extend Cuadrado {
	public Cubo() {
		Super();
	};
	public double Volumen()  {
		return area() * getLado();
	}
	
};