// Cyuenta.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//


#include <iostream>
#include <string>
#include "cuenta.h"
using namespace std;




int main()
{
    cuenta cuenta_1("ClaradelREy");
    cuenta cuenta_2("Fernando", 300);

    //ingreso de  dinero

    cuenta_1.ingresar(300);
    cuenta_2.ingresar(100);

    
    cuenta_1.retirar(500);
    cuenta_2.retirar(100);

    cout << "\n\n\tcuenta de " << cuenta_1.getTitular() << " tiene disponible "  << cuenta_1.getcantidad();
    cout << "\n\tcuenta de " << cuenta_2.getTitular() << " tiene disponible " << cuenta_2.getcantidad();

}

// Ejecutar programa: Ctrl + F5 o menú Depurar > Iniciar sin depurar
// Depurar programa: F5 o menú Depurar > Iniciar depuración

// Sugerencias para primeros pasos: 1. Use la ventana del Explorador de soluciones para agregar y administrar archivos
//   2. Use la ventana de Team Explorer para conectar con el control de código fuente
//   3. Use la ventana de salida para ver la salida de compilación y otros mensajes
//   4. Use la ventana Lista de errores para ver los errores
//   5. Vaya a Proyecto > Agregar nuevo elemento para crear nuevos archivos de código, o a Proyecto > Agregar elemento existente para agregar archivos de código existentes al proyecto
//   6. En el futuro, para volver a abrir este proyecto, vaya a Archivo > Abrir > Proyecto y seleccione el archivo .sln
