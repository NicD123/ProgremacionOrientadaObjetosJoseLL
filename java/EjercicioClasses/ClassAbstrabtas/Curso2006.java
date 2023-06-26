public class Curso2006 extends Curso {

	public Curso2006 (int c1, int c2, int c3, int eg){
		super( c1, c2, c3, eg);
	};
	public int obtenerPromedio(){
		int sumaParcial = parcial1 + parcial2 + parcial3;
		int promedio;
		if(sumaParcial < 18)
			promedio = (int) (sumaParcial / 3.0);
		else
			promedio = (int) (sumaParcial / 3.0 + 0.5);
		if(promedio > 8){
			if (global > promedio)
				return global;
			else
				return promedio;
		}else
			return global;
	};

}