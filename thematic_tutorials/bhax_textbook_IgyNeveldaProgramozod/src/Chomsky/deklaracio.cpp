int *getptr(int *t_ptr);
typedef int(*R)(int, int);
int get_int(int a, int b);
R getptr(int);

int *getptr(int *t){
    return t;
}

int get_int(int a, int b){
    return -10;
}

R get_init(int wishGranter){
    retrun get_int;
}

int main()
{
    //egész
    int a = 10;

    //egészre mutató mutató
    int *ptr = &a;

    //egész referenciája
    int &ref = a; 

    //egészek tömbje
    int t[10];

    //egészek tömbjének referenciája (nem az első elemé)
    int (&t)[10];

    //egészre mutató mutatók tömbje
    int *t_ptr[10];

    //egészre mutató mutatót visszaadó függvény
    int *ptr2  getptr(t_ptr);

    //egészre mutató mutatót visszaadó függvényre mutató mutató
    int *ptr3 (int *) = getptr;

    //egészet visszaadó és két egészet kapó függvényre mutató mutatót visszaadó, egészet kapó függvény
    R get_int = getptr(10);

    //függvénymutató egy egészet visszaadó és két egészet kapó függvényre mutató mutatót visszaadó, egészet kapó függvényre
    
}