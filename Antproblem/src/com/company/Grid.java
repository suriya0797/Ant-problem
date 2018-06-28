package com.company;

import java.util.ArrayList;

public class Grid {
    ArrayList<ArrayList> grid=new ArrayList<ArrayList>();

    void Initializegrid(int cells)
    {
        for(int i=0;i<cells;i++)
        {
            grid.add(new ArrayList<>());
            System.out.println();
            Assigngrid(i,cells);
        }
    }
    void Assigngrid(int i,int cells){
        for(int j=0;j<cells;j++)
        {
            grid.get(i).add('W');
        }
    }


    void Displaygrid(Grid g){
        for(int i=0;i<Main.n;i++)
        {
            System.out.println();
            fetchelement(g,i);

        }
    }
    void fetchelement(Grid g,int i){
        for(int j=0;j<Main.n;j++)
        {
            System.out.print(g.grid.get(i).get(j)+" ");
        }
    }

}
