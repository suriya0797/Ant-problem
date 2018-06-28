package com.company;

public class Direction {
public char currentdirection;

void Doinnorth(Grid g,Position p,Color c){

    if(c.currentcolor=='W') {
        this.currentdirection = 'E';
        c.flipcolor(g,p);
    }
    if(c.currentcolor=='B') {
        this.currentdirection='W';
        c.flipcolor(g,p);
    }
}
void Doineast(Grid g,Position p,Color c){
    if(c.currentcolor=='W')
    {
        this.currentdirection='S';
        c.flipcolor(g,p);
    }
    if(c.currentcolor=='B') {
        this.currentdirection='N';
        c.flipcolor(g,p);
    }
}
void Doinsouth(Grid g,Position p,Color c) {
    if (c.currentcolor=='W') {
        this.currentdirection = 'W';
        c.flipcolor(g, p);
    }
    if(c.currentcolor=='B') {
        this.currentdirection = 'E';
        c.flipcolor(g, p);
    }
}
void Doinwest(Grid g,Position p,Color c){
        if(c.currentcolor=='W')
        {
            this.currentdirection='N';
            c.flipcolor(g,p);
        }
        if(c.currentcolor=='B') {
            this.currentdirection='S';
            c.flipcolor(g,p);
        }
}
}
