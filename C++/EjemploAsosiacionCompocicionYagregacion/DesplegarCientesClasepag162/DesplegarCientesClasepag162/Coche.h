#pragma once
#include <iostream>
#include <string>
#include "Llanta.h"
using namespace std;

class Coche
{
public:
	Llanta llanta1, llanta2, llanta3, llanta4;
	Coche() = default;
	Coche(string nombrando) {
		this->nombre = nombrando;
		cout << "\n\tConstruyendo un coche " + nombre + ".\n";
	};
	Coche(string nombrando, Llanta l1, Llanta l2, Llanta l3, Llanta l4) {
		this->nombre = nombrando;
		this->llanta1 = l1;
		this->llanta2 = l2;
		this->llanta3 = l3;
		this->llanta4 = l4;
		cout << "\n\tConstruyendo un coche" + nombre + " con llantas asignadas.\n";
	}
	string setNombre() {
		return nombre;
	}
private:
	string nombre;
};


