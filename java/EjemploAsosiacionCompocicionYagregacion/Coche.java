public class Coche{
	private String nombre;
	public Llanta llanta, llanta2, llanta3, llanta4;
	public Coche(String nombre){
		System.out.println("Construyendo un coche " + nombre +".");
		this.nombre = nombre;
	}
	public Coche(String nombre, Llanta l1, Llanta l2, Llanta l3, Llanta l4){
		this.nombre = nombre;
		this.llanta = l1;
		this.llanta2 = l2;
		this.llanta3 = l3;
		this.llanta4 = l4;
		System.out.println("Construyendo un coche " + nombre +" con llantas asignadas.");
	}
	public String setNombre(){
		return nombre;
	}
}