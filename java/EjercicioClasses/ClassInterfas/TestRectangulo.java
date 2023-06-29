public class TestRectangulo{
	public static void main(String[] args){
		Rectangulo rectanguloEjemplo = new Rectangulo (20,30);
		System.out.println("Hay un Regtangulo de lados: " + rectanguloEjemplo.getLado1() + " y " + rectanguloEjemplo.getLado2() + "\n\n entonses su area es -> " + rectanguloEjemplo.area() + "\n\n su perimetro es -> " + rectanguloEjemplo.perimetro() );
		
		rectanguloEjemplo.cambiarValores(50, 70) ;

		System.out.println("Hay un Regtangulo de lados: " + rectanguloEjemplo.getLado1() + " y " + rectanguloEjemplo.getLado2() + "\n\n entonses su area es -> " + rectanguloEjemplo.area() + "\n\n su perimetro es -> " + rectanguloEjemplo.perimetro() );		
	}
}