public class Coche{
	private String nombre;
	public Llanta llanta, llanta2, llanta3, llanta4;
	public Coche(String nombre){
		System.out.println("Construyendo un coche " + nombre +".");
	}
	public Coche(String nombre, Llanta l1, Llanta l2, Llanta l3, Llanta l4){
		this.nombre = nombre;
		Llanta = l1;
		Llanta2 = l2;
		Llanta3 = l3;
		Llanta4 = l4;
		System.out.println("Construyendo un coche " + nombre +" con llantas asignadas.");
	}
	public String setNombre(){
		return nombre;
	}
}