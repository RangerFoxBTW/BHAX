#include <iostream>

using namespace std;

int main()
{
    int a = 1;
    int osszeg = 0; 
    do
    {
        osszeg++;
    } while(a <<= 1);
    cout << osszeg << endl;
}