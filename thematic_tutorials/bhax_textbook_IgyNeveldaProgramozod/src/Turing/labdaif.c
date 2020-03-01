#include <stdio.h>
#include <curses.h>
#include <unistd.h>

int main()
{
    int x, y, x_meret, y_meret;
    x = y = 0; 
    int sor = 1;
    int oszlop = 1;

    WINDOW *terminal;
    terminal = initscr();

    for(;;)
    {
        getmaxyx(terminal, y_meret, x_meret);
        mvprintw(y, x, "O");
        refresh();
        usleep(100000);
        clear();
        x += sor;
        y += oszlop;

        if (x <= 0)         //bal oldal
            sor *= -1;
        if (x >= x_meret-1)   //jobb oldal
            sor *= -1;
        if (y >= y_meret-1)   //alja
            oszlop *= -1;
        if (y <= 0)         //teteje
            oszlop *= -1;
    }
}