public class TestPosiblesClientes{
	public static void main(String [] args){
		int numClientes = 3;
		PosiblesClientes reporte;
		Llanta l1 = new Llanta(165.0, 14.0, 15.0);
		Llanta l2 = new Llanta(165.0, 14.0, 15.0);
		Llanta l3 = new Llanta(165.0, 14.0, 15.0);
		Llanta l4 = new Llanta(165.0, 14.0, 15.0);
		reporte = new PosiblesClientes( numClientes );
		reporte.agregaCliente(0,new Coche("Matys" , l1, l2, l3, l4), new Cliente("Juan"));
		reporte.agregaCliente(1,new Coche("Polo"), new Cliente("Juan"));
		reporte.agregaCliente(2,new Coche("Matys"), new Cliente("Juan", 46));
		System.out.println("\n\n\tListado de clientes y coches que les interesa");
		for(int i=0; i <= numClientes - 1; i++ ){
			reporte.despliegaPosibleCliente(i);
		}
	}
}