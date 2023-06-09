public class TarjetaDebito {
	private String cuenta;
	private double saldo;
	public TarjetaDebito (String cunenta, double saldo){
		this.cuenta = cuenta;
		this.saldo = saldo;
	}
	public double getSaldo () {
		return saldo;
	}
	public String getCuenta (){
		return cuenta;
	}
	public void meterDinero (double monto){
		saldo +=monto;
	}
	public boolean sacarDinero (double monto){
		if(monto <= saldo){
			saldo -=monto;
			return true;
		}else{
			return false;
		}
	}
}