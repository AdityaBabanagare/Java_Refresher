//Given a 2D integer array C[][] of A rows and B columns. Return an integer array of size B that represents the sums of the columns of the 2D array C.

//input:
// row = 3 col 2
// 1 2
// 3 4
// 4 4


//Code

import java.lang.*;
import java.util.*;

class Main {
	
	public static int[] solve(int A, int B, int[][] C) {

        int[] outArr = new int[B];

        for(int col = 0; col < B; col++){
            int sum = 0;
            for(int row = 0; row < A; row++){
                sum = sum + C[row][col]; 
            }
            outArr[col] = sum;
        }

        return outArr;
    }

	public static void main(String args[]) {
		// Your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		//take input or row and col
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		//create an array
		int[][] A = new int[row][col];
		
		//1st 2d array input
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("1st array: ");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int[] Addition = solve(row, col, A);
		
		//System.out.print(Addition);
		System.out.println("Addition of 2 Arrays:");
		for(int i = 0; i < col; i++){
			System.out.print(Addition[i] + " ");
		}
	}
}
