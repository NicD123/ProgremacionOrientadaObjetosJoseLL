#pragma once
class TarjetaDebito
{
protected:
	float saldo;
public:
	TarjetaDebito() {
		saldo = 0;
	};
	float consultar() {
		return saldo;
	}
	void meter(float monto) {
		saldo += monto;
	};
	void disponer(float monto) {
		if (monto <= saldo)
		{
			saldo -= monto;
		}
	};
};