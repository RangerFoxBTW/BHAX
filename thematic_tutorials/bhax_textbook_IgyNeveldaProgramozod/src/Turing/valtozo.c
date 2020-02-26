//Változók értékeinek felcserélése csereváltozó nélkül
#include<stdio.h>
int main()
{
    int a = 4;
    int b = 6;

    a = b - a;
    b -= a;
    a = b + a;

    printf("%d, %d", a, b);
}