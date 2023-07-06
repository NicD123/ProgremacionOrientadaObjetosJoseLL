import javax.swing.*;
public class PruebaEntrada2 {
	public static void main(String[] args){
		int edad;
		String entrada = JOptionPane.showInputDialog("¿Cuantos años tienes? (si existe algun conflicto tendra 2 intentos mas)");		
			try {

				edad = Integer.parseInt (entrada);
				System.out.println("Dentro de un año tendra " + (edad + 1) + " años");
			}catch (NumberFormatException e) {
				String cadena = e.getMessage();
				System.out.println(cadena);
				System.out.println("error de formato en el numero");
				try {
					String salida = JOptionPane.showInputDialog("¿Cuantos años tienes? (si existe algun conflicto tendra 1 intento mas)");
					edad = Integer.parseInt (salida);
					System.out.println("Dentro de un año tendra " + (edad + 1) + " años");
				}catch (NumberFormatException g) {
					cadena = g.getMessage();
					System.out.println(cadena);
					System.out.println("error de formato en el numero");
									try {
					String lol = JOptionPane.showInputDialog("¿Cuantos años tienes? (si existe algun conflicto tendra no tendra mas intentos )");
					edad = Integer.parseInt (lol);
					System.out.println("Dentro de un año tendra " + (edad + 1) + " años");
				}catch (NumberFormatException p) {
					cadena = p.getMessage();
					System.out.println(cadena);
					System.out.println("error de formato en el numero");
				}catch (Exception h) {
					cadena = h.getMessage();
					System.out.println(cadena);
					System.out.println("Se detecto un erro en la ejecusion");
				}

				}catch (Exception i) {
					cadena = i.getMessage();
					System.out.println(cadena);
					System.out.println("Se detecto un erro en la ejecusion");
				}
			}catch (Exception e) {
				String cadena = e.getMessage();
				System.out.println(cadena);
				System.out.println("Se detecto un erro en la ejecusion");
			}
	}
}