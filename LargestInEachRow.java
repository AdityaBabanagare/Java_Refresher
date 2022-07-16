//Given a 2D array A of N rows and M columns. Find value of largest element in each row. USING FUNCTION
//input 1:  A = [ [1, 2], [1, 3] ] 
//input 2:  A = [ [1, 2, 3] ] 


//Code:

import java.lang.*;
import java.util.*;

class Main {
	
	public static int[] largestOfRow(int[][] A) {

        int[] outArr = new int[A.length];

        for(int row = 0; row < A.length; row++){
            int max = A[row][0];
            for(int col = 0; col < A[0].length - 1; col++){
                if(max < A[row][col + 1]){
                    max = A[row][col + 1];
                }
            }
            outArr[row] = max;
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
		
		
		int[] output = largestOfRow(A);
		
		
		System.out.println("OUTPUT");
		for(int i = 0; i < row; i++){
			System.out.println("Largest element of row "+ i + " is " +output[i]);
		}
	}
}
