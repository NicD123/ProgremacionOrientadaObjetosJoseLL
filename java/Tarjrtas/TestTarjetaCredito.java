public class TestTarjetaCredito {
	public static void main(String[] args){
		TarjetaCredito tarjeta = new TarjetaCredito("Cuenta 0001", 2000.0, 1000);
		System.out.println("El saldo de la tarjeta es: " + tarjeta.getCuenta() + "\n\tDespues de arrancar con 2000.00 es :" + tarjeta.getSaldo() + "\nLa linea de credito es: " + tarjeta.getLineaDeCredito() );
		tarjeta.meterDinero(500.0);
		System.out.println("\n\tDespues de aber abonado 500 su saldo es: " + tarjeta.getSaldo() );
		if (tarjeta.sacarDinero(3000.0) == true) {
			System.out.println("\n\n\tSu saldo despues de retirar 3000 es: " + tarjeta.getSaldo() );
		}else{
			System.out.println("\n\n\t No fue posible retirar 3000" );
		}
		if (tarjeta.sacarDinero(1000.0) == true) {
			System.out.println("\n\n\tSu saldo despues de retirar 1000 es: " + tarjeta.getSaldo() );
		}else{
			System.out.println("\n\n\t No fue posible retirar 1000" );
		}
		tarjeta.meterDinero(1500.0);
		System.out.println("\n\tDespues de aber abonado 1500 su saldo es: " + tarjeta.getSaldo() );
	}
}