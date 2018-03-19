# Ant-problem

A square grid is composed of n x n cells/squares. Initially all the squares of the grid are colored White. The cells can toggle between white/black. The bottom left corner is identified as (0,0). There is an ant on the bottom left corner of the grid moving forward (up). The ant can travel in any of the four cardinal directions (N, E, W, S) at each step it takes. At end of each step, the ant does according to the rules below:
At a white square, flip the color of the square, turn 90° right
At a black square, flip the color of the square, turn 90° left
Now write a program to identify the state of the grid after "x" number of moves. The program should take "n" (number of rows/columns) and "x" (total number of steps) as input. 
The output of the program should print the state of the grid (color of each cell) and the final position and direction of the ant.
If the ant reaches a dead end and cannot move forward, bring the ant back to 0,0 without changing any color of the cell.
Sample input
n : 4
x : 5
Output : 
w w w w 
w w w w
w b w w
b b w w

Final Ant Position:  1, 0 W

Explanation:

Initially, the ant is in the 0, 0 position facing north:

3,0 (w) 3,1 (w) 3,2 (w) 3,3 (w)
2,0 (w) 2,1 (w) 2,2 (w) 2,3 (w)
1,0 (w) 1,1 (w) 1,2 (w) 1,3 (w)
0,0 (w) 0,1 (w) 0,2 (w) 0,3 (w)

For step 1, the ant moves to (1, 0). Since (1, 0) is white, the ant changes (1, 0) to black, turns 90° right (towards E)
For step 2, the ant moves to (1, 1). Since (1, 1) is white, the ant changes (1, 1) to black, turns 90° right (towards S) 
For step 3, the ant moves to (0, 1). Since (0, 1) is white, the ant changes (0, 1) to black, turns 90° right (towards W) 
For step 4, the ant moves to (0, 0). Since (0, 0) is white, the ant changes (0, 0) to black, turns 90° right (towards N) 
For step 4, the ant moves to (1, 0). Since (0, 0) is black, the ant changes (1, 0) to white, turns 90° left (towards W) 
Thus the final output as depicted above.
