/*
We use the integers , , and

to create the following series:
( a + 2^0 * b), ( a + 2^0 * b + 2^1 * b), ....
You are given
queries in the form of , , and . For each query, print the series corresponding to the given , , and values as a single line of space-separated integers.
*/

import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // number of testcases
    int t = sc.nextInt();
    for(int i = 0; i < t; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        for(int j = 0; j < n; j++){
            int sum = a;
            for(int k = 0; k <= j; k++){
                sum += Math.pow(2, k) * b;
            }
            System.out.print(sum +" ");
        }
        System.out.println();
    }
  }
}
