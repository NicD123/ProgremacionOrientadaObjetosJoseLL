#pragma once
#include "Circulo.h"
class Cilindro:public Circulo
{
protected:
	double altura;
public:
	Cilindro() {
		this->diametro = 0;
		this->altura = 0;
	}
	Cilindro(double diametro, double altura) {
		this->diametro = diametro;
		this->altura = altura;
	};
	void setAltura(double altura) {
		this->altura = altura;
	}
	double areaCilindro(){
		return (perimetro() * altura) + areaB();
	}
	double volumen() {
		return areaB() * altura;
	}

private:

};