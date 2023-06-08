public class TestTarjetaDevito {
	public static void main(String[] args){
		TarjetaDebito tarjeta = new TarjetaDebito("Cuenta 0001", 1000.0);
		System.out.println("El saldo de la tarjeta es: " + tarjeta.getCuenta() + "\n\tDespues de arrancar con 1000.00 es :" + tarjeta.getSaldo() );
		tarjeta.meterDinero(500.0);
		System.out.println("\n\tDespues de aber abonado 500 su saldo es: " + tarjeta.getSaldo() );
		if (tarjeta.sacarDinero(1000.0) == true) {
			System.out.println("\n\n\tSu saldo despues de retirar 1000 es: " + tarjeta.getSaldo() );
		}else{
			System.out.println("\n\n\t No fue posible retirar 1000" );
		}
	}
}