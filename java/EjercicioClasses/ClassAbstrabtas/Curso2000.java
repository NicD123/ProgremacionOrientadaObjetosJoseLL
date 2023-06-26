public class Curso2000 extends Curso {

	public Curso2000 (int c1, int c2, int c3, int eg){
		super( c1, c2, c3, eg);
	};
	public int obtenerPromedio(){
		int sumaParcial = parcial1 + parcial2 + parcial3;
		int promedio;
		if(sumaParcial < 18)
			promedio = (int) (sumaParcial / 3.0);
		else
			promedio = (int) (sumaParcial / 3.0 + 0.5);
		if (global > promedio)
			return global;
		else
			return promedio;
	};

}