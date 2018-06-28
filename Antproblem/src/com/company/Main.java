package com.company;

import java.util.Scanner;


public class Main {
static int n,x;

    public static void main(String[] args) {
        Direction d;
        Position p=new Position();
        Grid g=new Grid();
        Color c=new Color();

        System.out.println("Enter N:");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        System.out.println("Enter X:");
        x=scanner.nextInt();

        g.Initializegrid(n);  //initialize the grid with white
        d=p.Resetposition(p,n); //set the initial position of the ant
        c.currentcolor= (char) g.grid.get(p.row).get(p.column); //set the initial colour of initial position

        //Moving ant based on the direction
        for(int i=0;i<x;i++)
        {
            switch (d.currentdirection) {
                case 'N' :
                    if (p.row - 1 >= 0) {
                    p.row = p.row - 1;
                    c.currentcolor = (char) g.grid.get(p.row).get(p.column);
                    d.Doinnorth(g, p, c);
                    break;
                }
                d=p.Resetposition(p,n);
                break;
                case 'E':
                    if( p.column + 1 < n) {
                        p.column = p.column + 1;
                        c.currentcolor = (char) g.grid.get(p.row).get(p.column);
                        d.Doineast(g, p, c);
                        break;
                        }
                    d=p.Resetposition(p,n);
                    break;
                case 'S':
                if (p.row + 1 < n) {
                    p.row = p.row + 1;
                    c.currentcolor = (char) g.grid.get(p.row).get(p.column);
                    d.Doinsouth(g, p, c);
                    break;
                }
                d=p.Resetposition(p,n);
                break;
                case 'W':
                if(p.column - 1 >= 0) {
                    p.column = p.column - 1;
                    c.currentcolor = (char) g.grid.get(p.row).get(p.column);
                    d.Doinwest(g, p, c);
                    break;
                }
                d=p.Resetposition(p,n);
                break;
                default:
                    break;
                }
            }

     g.Displaygrid(g); //Displays the output grid
     System.out.println("\n");
     p.Finalposition(p); //Displays the final position of theant
    }
}
