#include <stdio.h>
#include <stdlib.h>
#include <curses.h>
#include <unistd.h>

int main()
{
    int xj = 0, xk = 0, yj = 0, yk = 0;
    int mx = 80 * 2, my = 24 * 2;

    WINDOW *terminal;
    terminal = initscr();
    noecho();
    cbreak();
    nodelay(terminal, true);

    for (;;)
    {
        xj = (xj - 1) % mx;
        xk = (xk + 1) % mx;

        yj = (yj - 1) % my;
        yk = (yk + 1) % my;

        clear ();

        mvprintw (0, 0,
                  "--------------------------------------------------------------------------------");
        mvprintw (24, 0,
                  "--------------------------------------------------------------------------------");
        mvprintw (abs ((yj + (my - yk)) / 2),
                  abs ((xj + (mx - xk)) / 2), "X");
                  
        refresh();
        usleep (100000);
    }
}