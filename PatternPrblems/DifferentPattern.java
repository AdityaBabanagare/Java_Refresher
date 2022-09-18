/*
Given an integer N, print the corresponding Full Numeric Pyramid pattern for N.

For example if N = 5 then pattern will be like:

0 0 0 0 5 0 0 0 0 
0 0 0 4 8 12 0 0 0 
0 0 3 6 9 12 15 0 0
0 2 4 6 8 10 12 14 0
1 2 3 4 5 6 7 8 9 
If the row is considered as i, the value of i for the top-most row will be 1 and then 2, 3, ...., N subsequently for remaining rows and the values of pyramid are decided as (N-i) * (number of non-zero values printed before + 1).

NOTE: There should be exactly one extra space after each number for each row.
*/

//Code:

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //input

        for(int i = 1; i <= N; i++){
            int z = N - i; //number of zeros

            for(int j = 1; j <= z; j++){
                //print the zeros
                System.out.print(0 + " ");
            }

            for(int j = 1; j <= (2 * i - 1); j++){
                //print the numnbers
                System.out.print( j * ( N - i + 1) + " ");
            }

            for(int j = 1; j <= z; j++){
                //print the zeros
                System.out.print(0 + " ");
            }

            System.out.println(); //new line
        }
    }
}
