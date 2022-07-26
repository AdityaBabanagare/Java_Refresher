/*

*________* // 8 spaces

**______** // 6 spaces

***____*** // 4 spaces

****__**** // 2 spaces

********** // 0 spaces

*/

//code...

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
      
      //take the input
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
          
          // 1st * pyaramid
            for(int j =  0; j <= i; j++){
                System.out.print("*");
            }
          
          // 1st space pyramid
            for(int k = 0; k < N - 1 - i; k++){
                System.out.print(" ");
            }
            // 2nd space pyramid
            for(int k = 0; k < N - 1 - i; k++){
                System.out.print(" ");
            }
          
          //2nd * pyaramid
            for(int j =  0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
