#include <iostream>
#include <cmath>
#include "png++/png.hpp"

int main(int argc, char *argv[])
{
    if (argc != 2)
    {
        std::cout << "Hasznalat: ./mandelpng fajlnev";
    
        return -1;
    }

    double a = -2.0, b = .7, c = -1.35, d = 1.35;
    int szelesseg = 600, magassag = 600, iteraciosHatar = 1000;

    png::image <png::rgb_pixel> kep(szelesseg, magassag);

    double dx = (b-a)/szelesseg;
    double dy = (d-c)/magassag;
    double reC, imC, reZ, imZ, ujreZ, ujimZ;

    int iteracio = 0;
    std::cout << "Szamitas";

    for (int j = 0; j < magassag; j++)
    {
        for (int k = 0; k < szelesseg; k++)
        {
            reC = a + k *dx;
            imC = d - j*dy;
            reZ = imZ = iteracio = 0;

            while (pow(reZ, 2) + pow(imZ, 2) < 4 && iteracio < iteraciosHatar)
            {
                ujreZ = pow(reZ, 2) - pow(imZ, 2) + reC;
                ujimZ = 2*reZ*imZ + imC;
                reZ = ujreZ;
                imZ = ujimZ;

                iteracio++;
            }

            kep.set_pixel(k, j, png::rgb_pixel(255 - iteracio % 256, 255 - iteracio % 256, 255 - iteracio % 256));
        }
        std::cout << "." << std::flush;
    }

    kep.write(argv[1]);
    std::cout << argv[1] << "mentve" << std::endl;
}