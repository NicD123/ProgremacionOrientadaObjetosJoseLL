#pragma once
#include <iostream>
#include <string>
using namespace std;

class Cliente
{
public:
	Cliente() = default;
	Cliente(string nombre) {
		this->nombre = nombre;
		this->edad = 0;
		cout << "\n\tDando de alta un cliente " << nombre << ".\n";
	};
	Cliente(string nombrando, int nEdad) {
		this->nombre = nombrando;
		this->edad = nEdad;
		cout << "\n\tDando de alta un cliente " << nombre << "con edad " << edad << ".\n";
	};
	string setNombre(){
		return nombre;
	}
	int setEdad() {
		return edad;
	}
private:
	int edad;
	string nombre;
};