public class TestCuadradoCubo {
	public static void main(String[] args){
		Cubo ejemploCuadrado= new Cubo();
		ejemploCuadrado.setLado(3);
		System.out.println("suponiendo que hay un cubo de lado 3.\n" + "El area es " + ejemploCuadrado.area() + "\nEl volumen es " + ejemploCuadrado.volumen() );
		
	}
}