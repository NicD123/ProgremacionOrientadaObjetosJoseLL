#pragma once
class Cuadrado
{
public:
	Cuadrado() {};
	double perimetro() {
		return lado * 4;
	};
	double area() {
		return lado * lado;
	};
	double getLado() {
		return lado;
	};
	void setLado(double tam) {
		this->lado = tam;
	};
private:
	double lado;
};

