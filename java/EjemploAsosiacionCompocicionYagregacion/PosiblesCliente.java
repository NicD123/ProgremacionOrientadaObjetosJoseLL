public class PosiblesCliente{
	private Coche [] listadoCoches;
	private Cliente [] listadoCliente;

	public PosiblesCliente(int n){
		listadoCoches = new Coche[n];
		listadoCliente = new Cliente[n];
	}

	public void agragarCliente(int lugar, Choche co, Clienre cl){
		Coche[ lugar ] = co;
		Cliente[ lugar ] = cl;

	}
	public void despliegaPosibleCliente(int lugar){
		System.out.println(
		lugar + ") " +
		listadoCliente[lugar].setNombre() + " (" + 
		listadoCliente[lugar].setEdad() + ") " +
		listadoCoches[lugar].setNombre() );
	}
}