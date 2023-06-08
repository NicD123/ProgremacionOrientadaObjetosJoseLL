#pragma once
#include "TarjetaDebito.h"
class TarjetaCredito : public TarjetaDebito
{

private:
	float lineaDeCredito;
public:
	TarjetaCredito() {
		lineaDeCredito = 1000;
	};
	void cambiarLimite(float dato) {
		lineaDeCredito = dato;
	};
	int disponer(float monto) {
		if (monto <= saldo + lineaDeCredito)
		{
			saldo -= monto;
			return 1;
		}
		else
		{
			return 0;
		}
	};

};
