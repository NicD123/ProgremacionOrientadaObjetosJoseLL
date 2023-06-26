public abstract class Curso {

	protected int parcial1, parcial2, parcial3, global;
	public Curso(int c1, int c2, int c3, int eg){
		parcial1 = c1; parcial2 = c2; parcial3 = c3; global = eg;
	}
	public void cambiarCalificaciones (int c1, int c2, int c3, int eg){
		parcial1 = c1; parcial2 = c2; parcial3 = c3; global = eg;
	}
	public abstract int obtenerPromedio();

}