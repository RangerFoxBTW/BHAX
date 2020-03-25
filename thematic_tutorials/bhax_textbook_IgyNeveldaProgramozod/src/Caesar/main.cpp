#include <iostream>
#include "mlp.hpp"
#include "png++/png.hpp"
//g++ mlp.hpp main.cpp -o perc -lpng -std=c++11
int main (int argc, char **argv)
{
    png::image <png::rgb_pixel> png_image (argv[1]);            //képnek helyfoglalás
    int size = png_image.get_width()*png_image.get_height();    //kép szélessége*hossza
    Perceptron* p = new Perceptron(3, size, 256, 1);            //3 réteg, első rétegnap size db neuron, a második 256, a harmadiknál egy szám lesz az eredmény
    double* image = new double[size];                           //új kép, size méretű
    //feltöltjük a beolvasott képpel
    for(int i {0}; i<png_image.get_width(); ++i)
        for(int j {0}; j<png_image.get_height(); ++j)
            image[i*png_image.get_width()+j] = png_image[i][j].red; //rgb objektum
    
    double value = (*p) (image); //függvény operátor, aminek átadjuk a képet
    
    std::cout << value << std::endl;
    
    delete p;               //töröljük a perceptront
    delete [] image;        //töröljük a képet
}