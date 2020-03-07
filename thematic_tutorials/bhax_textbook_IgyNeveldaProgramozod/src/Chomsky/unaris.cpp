#include <iostream>
#include <limits>

using namespace std;

void konvertal(int szam)
{
    cout << endl;
    for(int i = 0; i < szam; i++)
    {
        cout << "1";
    }
    cout << endl;
}

int main()
{
    int szam;
    
    cout << "Adj meg egy szamot!" << endl;
    cin >> szam;
    
    konvertal(szam);
}