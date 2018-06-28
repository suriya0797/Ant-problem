package com.company;

public class Color {
    char currentcolor;

    public void flipcolor(Grid g,Position p){
        if(this.currentcolor=='W')
        {
            g.grid.get(p.row).set(p.column,'B');
        }
        if(this.currentcolor=='B')
        {
            g.grid.get(p.row).set(p.column,'W');
        }
    }

}
