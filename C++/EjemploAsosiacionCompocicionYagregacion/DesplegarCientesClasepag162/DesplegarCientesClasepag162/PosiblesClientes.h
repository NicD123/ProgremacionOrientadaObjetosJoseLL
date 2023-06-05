#pragma once
#include <iostream>
#include <string>
#include "Llanta.h"
#include "Coche.h"
#include "Cliente.h"
using namespace std;
class PosivlesClientes
{
public:
	PosivlesClientes(int n) {
		this->listaClientes = new Cliente[n];
		this->listaCoches = new Coche[n];
	};
	void agregarCliente(int Lugar, Coche co, Cliente ci) {
		listaClientes[Lugar] = ci;
		listaCoches[Lugar] = co;
	}
	void desplegarPosiblesClientes(int Lugar) {
		cout << "\n\t" << Lugar << ") " << listaClientes[Lugar].setNombre() << " (" << listaClientes[Lugar].setEdad() << ") " << listaCoches[Lugar].setNombre();
	}
private:
	Coche *listaCoches;
	Cliente* listaClientes;
};