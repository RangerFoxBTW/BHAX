#include <stdio.h>
#include <math.h>

void kiir (double tomb[], int db){
    for (int i = 0; i < db; i++)
    printf("PageRank [%d]: %lf\n", i, tomb[i]);
}

double tavolsag (double PR[], double PRv[], int n){
    double osszeg = 0.0;
    for (int i = 0; i < n; ++i)
    osszeg += (PRv[i] - PR[i]) * (PRv[i] - PR[i]);

    return sqrt(osszeg);
}

int main()
{
    int i, j;
    double T[4][4] = {
    {0.0, 0.0, 1.0 / 3.0, 0.0},
    {1.0, 1.0 / 2.0, 1.0 / 3.0, 1.0},
    {0.0, 1.0 / 2.0, 0.0, 0.0},
    {0.0, 0.0, 1.0 / 3.0, 0.0}};

    double PR[4] = {0.0, 0.0, 0.0, 0.0};
    double PR_elozo[4] = {1.0 / 4.0, 1.0 / 4.0, 1.0 / 4.0, 1.0 / 4.0};

    for(;;)
    {
        for(i = 0; i < 4; i++)
        {
            PR[i] = 0.0;
            for(j = 0; j < 4; j++)
                PR[i] += (T[i][j] * PR_elozo[j]);
        }
        if (tavolsag(PR, PR_elozo, 4) < 0.00000001)
            break;
        for(i = 0; i < 4; i++)
            PR_elozo[i] = PR[i];      
    }

    kiir(PR, 4);
}