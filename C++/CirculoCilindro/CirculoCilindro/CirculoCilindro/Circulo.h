#pragma once
class Circulo
{
protected:
	double diametro;
	const float pi = 3.1416;
public:
	Circulo() {
		this->diametro = 0;
	};
	Circulo(int diametro) {
		this->diametro = diametro;
	};
	double areaB() {
		return pi * (diametro / 2) * (diametro / 2);
	};
	double perimetro() {
		return pi * diametro;
	};
	double getDiametro() {
		return diametro;
	};
	void setDiametro( double diametro) {
		this->diametro = diametro;
	}
private:

};
