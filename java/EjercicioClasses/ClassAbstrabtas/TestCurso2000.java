public class TestCurso2000{
	public static void main(String[] args){
		Curso2000 cursoEjemplo = new Curso2000(7, 7, 6, 5);
		System.out.println("Parciales de 7, 7 y 6, y fnal de 5 es: " 
 + cursoEjemplo.obtenerPromedio() );

		cursoEjemplo.cambiarCalificaciones(8, 8, 8, 7);
		System.out.println("\n\nParciales de 8, 8 y 8, y fnal de 7 es: " 
 + cursoEjemplo.obtenerPromedio() );
		
	}
}