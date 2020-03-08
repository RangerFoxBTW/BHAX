#include <stdio.h>

int main()
{
    //komment                    //-rel nem lehet kommentelni, csak /**/-rel jó

    for (int i = 0; i < 5; i++) //nem lehet for cikluson belül deklarálni
    {
        long long int a = 2;    //nem támogatott típus
    }
    gets(a);                    //warning, c11-gyel már hiba
}