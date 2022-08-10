/*
Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
Input 1:  A = [1, 2, 3, 4, -10] 
Output: 10

Input 2: A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        
        int A[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //hardcoded values
        
        int n = A.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i< n; i++){
          //calculate the sum of subarray
            sum = sum + A[i]; 
          //check the sum is greater than the maxSum and replace it
            maxSum = Math.max(sum, maxSum);
            if(sum < 0){
                sum = 0;
            }
        }
      //fetch the maxSum
        System.out.print(maxSum);
    }
}
