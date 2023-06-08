// Tarjetas.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//

#include <iostream>
#include <conio.h>
#include <stdio.h>
#include "TarjetaDebito.h"
#include "TarjetaCredito.h"
using namespace std;

int main()
{
	int confirmar;
	float monto;
	TarjetaDebito ejemplo1;
	cout << "\n \t El saldo de su tarjeta de Devito es: " << ejemplo1.consultar();
	cout << "\n\t ¿Cuanto desea aboanar a la tarjeta?\n";
	cin >> monto;
	ejemplo1.meter(monto);
	cout << "\n\n\n \t El saldo es: " << ejemplo1.consultar();
	cout << "\n\n\t ¿Cuanto desea retirar a la tarjeta?\n";
	cin >> monto;
	ejemplo1.disponer(monto);
	cout << "\n\n\n \t El saldo final de su Tarjeta de Devito es: " << ejemplo1.consultar();

	TarjetaCredito ejemplo2;
	cout << "\n \t El saldo de su Tarjeta de Credito es: " << ejemplo2.consultar();
	cout << "\n\t ¿Cuanto desea aboanar a la tarjeta?\n";
	cin >> monto;
	ejemplo2.meter(monto);
	cout << "\n \t El saldo de su Tarjeta de Credito es: " << ejemplo2.consultar();
	cout << "\n\n\t ¿Cuanto desea aboanar a la tarjeta?\n";
	cin >> monto;
	confirmar=  ejemplo2.disponer(monto);
	if (confirmar == 1)
	{
		cout << "\n \t El saldo de su Tarjeta de Credito es: " << ejemplo2.consultar() << "\n\nOprima cualquier tecla para finalisar";
	}
	else
	{
		cout << "\n \t No hay sufisiente cupo";
	}
	_getch();

}

// Ejecutar programa: Ctrl + F5 o menú Depurar > Iniciar sin depurar
// Depurar programa: F5 o menú Depurar > Iniciar depuración

// Sugerencias para primeros pasos: 1. Use la ventana del Explorador de soluciones para agregar y administrar archivos
//   2. Use la ventana de Team Explorer para conectar con el control de código fuente
//   3. Use la ventana de salida para ver la salida de compilación y otros mensajes
//   4. Use la ventana Lista de errores para ver los errores
//   5. Vaya a Proyecto > Agregar nuevo elemento para crear nuevos archivos de código, o a Proyecto > Agregar elemento existente para agregar archivos de código existentes al proyecto
//   6. En el futuro, para volver a abrir este proyecto, vaya a Archivo > Abrir > Proyecto y seleccione el archivo .sln
