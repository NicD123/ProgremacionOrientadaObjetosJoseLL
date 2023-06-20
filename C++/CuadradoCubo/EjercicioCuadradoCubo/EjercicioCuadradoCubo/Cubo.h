#pragma once
#include "Cuadrado.h"
class Cubo :public Cuadrado
{
public:
	Cubo() {};
	double volumen() {
		return area() * getLado();
	};

private:

};
