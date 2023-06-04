public class Cliente{
	private String nombre;
	private int edad;
	public Cliente(String nombre){
		this.nombre = nombre;
		edad = 0;
		System.out.println("Dando de alta un cliente " + nombre + ".");
	}

	public Cliente(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("Dando de alta un cliente " + nombre +" con edad "+ edad +".");
	}
	public String setNombre(){
		return nombre;
	}
	public int setEdad(){
		return edad;
	}
}