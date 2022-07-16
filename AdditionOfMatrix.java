//Write a program to add the two 2D array Matrix using Function in Java

// row = 3; col = 3
//1st matxix    //2nd Matrix
// 1 2 3        // 1 2 3
// 1 2 3        // 1 2 3
// 1 2 3        // 1 2 3

//CODE:

import java.lang.*;
import java.util.*;

class Main {
	
  //Function solveAdd to add the 2 matrixes
	public static int[][] solveAdd(int[][] A, int[][] B){
	int[][] outArr = new int[A.length][A[0].length];
	
	for(int i = 0; i < A.length; i++){
		for(int j = 0; j < A[0].length; j++){
			outArr[i][j] = outArr[i][j] + (A[i][j] + B[i][j]);
		}
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
		int[][] B = new int[row][col];
		
		//1st 2d array input
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				A[i][j] = sc.nextInt();
			}
		}
		
		//2nd 2d array input
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				B[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("1st array: ");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("2nd Array: ");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] Addition = solveAdd(A, B);
		
		//System.out.print(Addition);
		System.out.println("Addition of 2 Arrays:");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(Addition[i][j] + " ");
			}
			System.out.println();
		}
	}
}
