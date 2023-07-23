#pragma once
#include <iostream>
#include <string>
using namespace std;


class cuenta
{
private:
	string dueno;
	double cantidad;
public:
	cuenta(string t, double c) {
		this->dueno = t;
		if (c < 0) {
			this->cantidad = 0;
		}
		else
		{
			this->cantidad = c;
		}
	};
	cuenta(string t) {
		this->dueno = t;
		this->cantidad = 0;
	};

	string getTitular() {
		return dueno;
	};
	double getcantidad() {
		return cantidad;
	};

	void setTitular(string t) {
		this->dueno = t;
	};
	void setcantidad(double c) {
		this->cantidad = c;
	};

	void ingresar(double c) {
		if (c > 0) {
			cantidad += c;
		}
	};

	void retirar(double c) {
		cantidad -= c;
		if (cantidad < 0) {
			cantidad = 0;
		}
	};
};