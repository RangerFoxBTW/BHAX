int *getptr(int *t){
    return t;
}

int main()
{
    //egész
    int a = 2;
    //egészre mutató mutató
    int *ptr = &a;

    //egész referenciája (C++)
    

    //egészek tömbje
    int t[5] = {1, 2, 3, 4, 5};

    //egészek tömbjének referenciája (nem az első elemé)
    //int (&ref1)[5] = t;

    //egészre mutató mutatók tömbje
    int ptr_t[5];

    //egészre mutató mutatót visszaadó függvény
    int *fv = getptr(t); 

    //egészre mutató mutatót visszaadó függvényre mutató mutató
    int* (*ujptr)(int*) = getptr;

    //egészet visszaadó és két egészet kapó függvényre mutató mutatót visszaadó, egészet kapó függvény
    

    //függvénymutató egy egészet visszaadó és két egészet kapó függvényre mutató mutatót visszaadó, egészet kapó függvényre
    int (*(*fn)(int))int, int);
    
    
}