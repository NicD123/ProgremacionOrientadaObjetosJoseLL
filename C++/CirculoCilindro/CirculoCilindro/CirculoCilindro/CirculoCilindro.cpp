// CirculoCilindro.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//


#include <iostream>
#include <conio.h>
#include <stdio.h>
#include "Circulo.h"
#include "Cilindro.h"
using namespace std;

int main()
{
    double altura;
    double diametro;
    int control;
    Circulo objetoCirculo;
    Cilindro objetoCilindro;

    cout << "\n\t\tEste programa le dira el Area y Perimetro de un circulo basado en su diametro\n";
    cout << "\t\tLuego le dara el perimero de la base de un cilindro, las areas y los volumenes \n";
    do
    {
        cout << "\n\n\n\n\t-------\t diguite 1 si es un circulo\n \t digite 2 si es un cilindro\n\t digite 0 para terminar: \n";
        cin >> control;
        switch (control) {
            case 0:
                break;
            case 1:
                cout << "\t-------\t Ingrece el diametro: \n";
                cin >> diametro;
                objetoCirculo.setDiametro(diametro);
                cout << "\n\n\n\tArea: " << objetoCirculo.areaB();
                cout << "\n\tPerimetro: " << objetoCirculo.perimetro() << "\n\n";
                break;
            case 2:
                cout << "\t-------\t Ingrece el diametro: \n";
                cin >> diametro;
                cout << "\n\n\n\n\t-------\t Ingrece la altura: \n";
                cin >> altura;
                objetoCilindro.setDiametro(diametro);
                objetoCilindro.setAltura(altura);
                cout << "\n\tPerimetro: " << objetoCilindro.perimetro() << "\n\n";
                cout << "\n\n\n\tArea: " << objetoCilindro.areaCilindro();
                cout << "\n\tVolumen: " << objetoCilindro.volumen() << "\n\n";

                break;
            default:
                cout << "\t\tvalor no valido";
        }
    } while (control != 0);
}

// Ejecutar programa: Ctrl + F5 o menú Depurar > Iniciar sin depurar
// Depurar programa: F5 o menú Depurar > Iniciar depuración

// Sugerencias para primeros pasos: 1. Use la ventana del Explorador de soluciones para agregar y administrar archivos
//   2. Use la ventana de Team Explorer para conectar con el control de código fuente
//   3. Use la ventana de salida para ver la salida de compilación y otros mensajes
//   4. Use la ventana Lista de errores para ver los errores
//   5. Vaya a Proyecto > Agregar nuevo elemento para crear nuevos archivos de código, o a Proyecto > Agregar elemento existente para agregar archivos de código existentes al proyecto
//   6. En el futuro, para volver a abrir este proyecto, vaya a Archivo > Abrir > Proyecto y seleccione el archivo .sln
