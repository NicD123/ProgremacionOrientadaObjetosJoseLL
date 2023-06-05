// DesplegarCientesClasepag162.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//

#include <iostream>
#include <string>
#include "Llanta.h"
#include "Coche.h"
#include "Cliente.h"
#include "PosiblesClientes.h"
using namespace std;

int main()
{
    int numClientes;
    cout << "ingrese el numero de clientes que hay";
    cin >> numClientes;
    PosivlesClientes reporte(numClientes);
    Llanta l1(165.0, 14.0, 15.0);
    Llanta l2(165.0, 14.0, 15.0);
    Llanta l3(165.0, 14.0, 15.0);
    Llanta l4(165.0, 14.0, 15.0);
    for (size_t i = 0; i < numClientes; i++)
    {
        if ((i + 2) < numClientes)
        {
            reporte.agregarCliente(i, Coche("Matys", l1, l2, l3, l4), Cliente("Juan"));
            reporte.agregarCliente(i++, Coche("Polo"), Cliente("Juan"));
            reporte.agregarCliente(i++, Coche("Matys"), Cliente("Juan", 46));
        }
        else {
            if ((i+ 1) < numClientes)
            {
                reporte.agregarCliente(i, Coche("Polo"), Cliente("Juan"));
                reporte.agregarCliente(i++, Coche("Matys"), Cliente("Juan", 46));
            }
            else
            {
                reporte.agregarCliente(i, Coche("Matys", l1, l2, l3, l4), Cliente("Juan"));
            }
        }
    }


    
    cout << "\n\n\tListado de clientes y coches que les interesa";
    for (size_t i = 0; i < numClientes; i++)
    {
        reporte.desplegarPosiblesClientes(i);
    }
    
}

// Ejecutar programa: Ctrl + F5 o menú Depurar > Iniciar sin depurar
// Depurar programa: F5 o menú Depurar > Iniciar depuración

// Sugerencias para primeros pasos: 1. Use la ventana del Explorador de soluciones para agregar y administrar archivos
//   2. Use la ventana de Team Explorer para conectar con el control de código fuente
//   3. Use la ventana de salida para ver la salida de compilación y otros mensajes
//   4. Use la ventana Lista de errores para ver los errores    
//   5. Vaya a Proyecto > Agregar nuevo elemento para crear nuevos archivos de código, o a Proyecto > Agregar elemento existente para agregar archivos de código existentes al proyecto
//   6. En el futuro, para volver a abrir este proyecto, vaya a Archivo > Abrir > Proyecto y seleccione el archivo .sln
