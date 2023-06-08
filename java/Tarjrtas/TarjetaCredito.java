public class TarjetaCredito extends TarjetaDebito {
	private double lineaDeCredito;
	private double tasaInteres = 0.03;
	public TarjetaCredito (String cuenta, double saldo){
		super(cuenta, saldo);
		lineaDeCredito = 0;
	}
	public TarjetaCredito (String cuenta, double saldo, double lineaDeCredito){
		super(cuenta, saldo);
		this.lineaDeCredito = lineaDeCredito;
	}
	public double getLineaDeCredito() {
		return lineaDeCredito;
	}
	public void setLineaDeCredito (double monto ) {
		lineaDeCredito = monto;
	}
	public boolean sacarDinero (double monto){
		if (monto <= saldo + lineaDeCredito) {
			saldo -= monto;
			return true;
		}else{
			return false;
		}
	}
	public void cargarInteresMensual(){
		if( getSaldo() < 0 ){
			saldo += getSaldo() * tasaInteres;
		}
	}
	
}