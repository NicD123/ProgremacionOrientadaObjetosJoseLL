import javax.swing.*;
public class PruebaEntrada {
	public static void main(String[] args){
		
		String entrada = JOptionPlane.showImputDIalog("¿Cuantos años tienes?");
		try {
			int edad = Integer.parseInt (entrada);
			System.out.println("Dentro de un año tendra" + (edad + 1) + "años");
		}catch (NumerFormatException e) {
			String cadena = e.getMessage();
			System.out.println(cadena);
			System.out.println("error de formato en el numero");

		}catch (Exception e) {
			String cadena = e.getMessage();
			System.out.println(cadena);
			System.out.println("Se detecto un erro en la ejecusion");
		}
	}
}