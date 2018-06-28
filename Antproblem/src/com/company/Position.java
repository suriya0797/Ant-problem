package com.company;

public class Position {
    int row,column;
    Direction d=new Direction();

    Direction Resetposition(Position p, int n){
        p.row= n -1;
        p.column=0;
        d.currentdirection='N';
        return d;
    }
    public void currentPosition(Position p){
        System.out.println(p.row+" "+p.column+" "+d.currentdirection);
    }
    void Finalposition(Position p)
    {
        System.out.println((Main.n-1)-p.row+","+p.column+" "+d.currentdirection);
    }
}
