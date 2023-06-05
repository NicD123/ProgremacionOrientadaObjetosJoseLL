#pragma once
class Llanta
{
public:
	Llanta() = default;
	Llanta(double alto, double ancho, double radio) {
		altura = alto;
		anchura = ancho;
		rin = radio;
	};

private:
	double altura;
	double anchura;
	double rin;
};

