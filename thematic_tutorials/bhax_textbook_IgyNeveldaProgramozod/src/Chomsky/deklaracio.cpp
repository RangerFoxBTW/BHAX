int *fn(){
    int a = 1;
    int *ptr = &a;

    return ptr;
}

int main()
{
    //egész
    int a = 1;

    //egészre mutató mutató
    int b = 1;
    int *ptr = &b;

    //egész referenciája
    int c = 1;
    int &ref = c;

    //egészek tömbje
    int t[5] = {1, 2, 3, 4, 5};

    //egészek tömbjének referenciája (nem az első elemé)
    int (&t_ref)[5] = t;

    //egészre mutató mutatók tömbje
    int *ptr2[5];

    //egészre mutató mutatót visszaadó függvény
    int *(*ptr3)() = fn;

    //egészre mutató mutatót visszaadó függvényre mutató mutató
    void*(fn);
}