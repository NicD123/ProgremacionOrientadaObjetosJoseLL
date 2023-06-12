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

    cout << "\n\t\tEste programa le dira el Area y Perimetro de un circulo basado en su diametro \n este es un mensaje sospechoso\n";
    cout << "\t\tLuego le dara el perimero de la base de un cilindro, las areas y los volumenes \n";
    cout << "\t-------\t Ingrece el diametro(para finalisar digite 0): \n";
    cin >> diametro;
    Circulo objetoCirculo(diametro);
    do
    {
        objetoCirculo.setDiametro(diametro);
        cout << "\n\n\n\tArea: " << objetoCirculo.areaB();
        cout << "\n\tPerimetro: " << objetoCirculo.perimetro()<<"\n\n";
        cout << "\t-------\t Ingrece el diametro(para finalisar digite 0): \n";
        cin >> diametro;
    } while (diametro>0);

    cout << "\n\n\n\n\t-------\t CILINDRO: \n";
    cout << "\n\t-------\t Ingrece el diametro: \n";
    cin >> diametro;
    cout << "\n\n\n\n\t-------\t Ingrece la haltura: \n";
    cin >> altura;

    Cilindro objetoCilindro(diametro,altura);
    do
    {
        objetoCilindro.setDiametro(diametro);
        objetoCilindro.setAltura(altura);
        cout << "\n\tPerimetro: " << objetoCilindro.perimetro() << "\n\n";
        cout << "\n\n\n\tArea: " << objetoCilindro.areaCilindro();
        cout << "\n\tVolumen: " << objetoCilindro.volumen() << "\n\n";
        cout << "\t-------\t Ingrece el diametro: \n";
        cin >> diametro;
        cout << "\n\n\n\n\t-------\t Ingrece la haltura(para finalisar digite 0): \n";
        cin >> altura;
    } while (altura > 0);


}

// Ejecutar programa: Ctrl + F5 o menú Depurar > Iniciar sin depurar
// Depurar programa: F5 o menú Depurar > Iniciar depuración

// Sugerencias para primeros pasos: 1. Use la ventana del Explorador de soluciones para agregar y administrar archivos
//   2. Use la ventana de Team Explorer para conectar con el control de código fuente
//   3. Use la ventana de salida para ver la salida de compilación y otros mensajes
//   4. Use la ventana Lista de errores para ver los errores
//   5. Vaya a Proyecto > Agregar nuevo elemento para crear nuevos archivos de código, o a Proyecto > Agregar elemento existente para agregar archivos de código existentes al proyecto
//   6. En el futuro, para volver a abrir este proyecto, vaya a Archivo > Abrir > Proyecto y seleccione el archivo .sln
