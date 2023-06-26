public class TestCurso2006{
	public static void main(String[] args){
		Curso2006 cursoEjemplo = new Curso2006(7, 7, 6, 5);
		System.out.println("Parciales de 7, 7 y 6, y fnal de 5 es: " 
 + cursoEjemplo.obtenerPromedio() );

		cursoEjemplo.cambiarCalificaciones(8, 8, 8, 7);
		System.out.println("\n\nParciales de 8, 8 y 8, y fnal de 7 es: " 
 + cursoEjemplo.obtenerPromedio() );
		
	}
}