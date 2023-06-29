public class TestTriangulo{
	public static void main(String[] args){
		Triangulo trianguloEjemplo = new Triangulo (1,10);
		System.out.println(("Hay un Triangulo " + trianguloEjemplo.getTipo() + " de lado: " 
 + trianguloEjemplo.getLado1() + " y altura " + trianguloEjemplo.getLado2() + "\n\n entonses su area es -> " trianguloEjemplo.area() + "\n\n su perimetro es -> " trianguloEjemplo.perimetro() );
		
		regtanguloEjemplo.cambiarValores(2,50 , 70, 80) ;

		System.out.println(("Hay un Triangulo " + trianguloEjemplo.getTipo() + " de lados: " 
 + trianguloEjemplo.getLado1() + " y " + trianguloEjemplo.getLado2() + " y " + trianguloEjemplo.getLado3() + "\n\n entonses su area es -> " trianguloEjemplo.area() + "\n\n su perimetro es -> " trianguloEjemplo.perimetro() );;
		
	}
}