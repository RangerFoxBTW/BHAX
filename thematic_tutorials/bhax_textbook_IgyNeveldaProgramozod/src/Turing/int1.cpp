#include <iostream>

using namespace std;

int main()
{
    int a = 1;
    int osszeg = 0;

    while (a <<= 1)
        osszeg++;
    cout << osszeg+1 << endl;
}