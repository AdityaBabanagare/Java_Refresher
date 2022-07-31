/*
Problem Description

Given an integer N, print the corresponding Full Numeric Pyramid pattern for N.

For example if N = 5 then pattern will be like:

0 0 0 0 1 0 0 0 0 
0 0 0 2 3 2 0 0 0 
0 0 3 4 5 4 3 0 0
0 4 5 6 7 6 5 4 0
5 6 7 8 9 8 7 6 5 

NOTE: There should be exactly one extra space after each number for each row.

*/

import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 0, y =0;
        //rows
        for(int i =1; i <= N; i++){
            //print left zeros
            for(int j = 0; j < N - i ; j++){
                System.out.print("0 ");
            }
            
            //print left numbers pyramid
            x = i;
            for(int k = 1 ; k <= i; k++){
                System.out.print(x + " ");
                x++;
            }
            //right side numbers
            y = 2 * i - 2;
            for(int k = 1 ; k < i; k++){
                System.out.print(y + " ");
                y--;
            }
            
            //print right zeros
            for(int j = 0; j < N - i ; j++){
                System.out.print("0 ");
            }
            
            //next line
            System.out.println();
        }
    }
}
