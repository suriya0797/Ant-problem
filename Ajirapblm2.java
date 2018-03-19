/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajirapblm2;

import java.util.Scanner;

/**
 *
 * @author suriya venkatesan
 */
public class Ajirapblm2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        //Fetch the inputs n and x
        System.out.print("n:");
        int n=s.nextInt();
        System.out.print("x:");
        int x=s.nextInt();
        
        char[] state= new char[1];
        char a[][]=new char[n][n];
        
        //Declaration of array of with initial colour white
        for(int i=0;i<n;i++)
        {
            System.out.println();
            for(int j=0;j<n;j++)
            {
                a[i][j]='w';
                System.out.print("\t"+a[i][j]);
            }  
        }
        System.out.println();

        state[0]='I';
        int i=n-1,j=0;
        
        //Ant moving direction is based on this loop
        for(int k=1;k<=x;k++)
        {
            if((i-1)>=0 && a[i-1][j]=='w'&& state[0]=='I')
            {
                state[0]='E';
                i=i-1;
                a[i][j]='b';
            } 
            //else loop executes based on the direction(state) ,position and colour of a square
            else
            {
                //The if loop executes only one time at start
                if(state[0]=='E' && (j+1)<n && a[i][j+1]=='w')
                {
                    j=j+1;
                    a[i][j]='b';
                    state[0]='S';
                    }
                else if(state[0]=='S'&& (i+1)<n && a[i+1][j]=='w')
                {
                    i=i+1;
                    a[i][j]='b';
                    state[0]='W';
                }
                else if(state[0]=='W' && (j-1)>=0 && a[i][j-1]=='w')
                {
                    j=j-1;
                    a[i][j]='b';
                    state[0]='N';     
                }
                else if(state[0]=='N'&&(i-1)>=0 && a[i-1][j]=='b')
                {
                    i=i-1;
                    a[i][j]='w';
                    state[0]='W';
                    
                }
                
                else if(state[0]=='N' && (i-1)>=0 && a[i-1][j]=='w')
                {
                    i=i-1;
                    a[i][j]='b';
                    state[0]='E';
                }
                else if(state[0]=='E'&& (j+1)<n && a[i][j+1]=='b')
                {
                    j=j+1;
                    a[i][j]='w';
                    state[0]='N';
                }
                else if(state[0]=='W'&& (j-1)>=0 && a[i][j-1]=='b')
                {
                    j=j-1;
                    a[i][j]='w';
                    state[0]='S';
                }
                else if(state[0]=='S' && (i+1)<n && a[i+1][j]=='b')
                {
                    i=i+1;
                    a[i][j]='w';
                    state[0]='E';
                }
                //If dead end is reached else loop is executed
                else
                {
                    i=n-1;
                    j=0;
                    state[0]='N';
                }
            }
        }
      //prints the final outcome
      System.out.println("\nFinal Position Table:");
       for(int l=0;l<n;l++)
        {
            System.out.println();
            for(int m=0;m<n;m++)
            {
                System.out.print("\t"+a[l][m]);
            }
        }
        System.out.println("\n\nFinal Ant Position: "+((n-1)-i)+","+j+" "+state[0]);
    }
}
