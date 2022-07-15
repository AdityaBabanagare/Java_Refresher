//Write a program to input an integer N and a N*N matrix Mat from user and print the matrix in wave form (column wise)
//inputs:
// N = 3
//4 1 2 
//7 4 4 
//3 7 4 

//outputs:
//4 7 3 7 4 1 2 4 4 

//CODE:

import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0;j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int col = 1;
        for(int i = 0; i < N; i++){

            if( col % 2 != 0){
                for(int j = 0; j < N; j++){
                    System.out.print(arr[j][i] + " ");
                }
            } else{
                for(int j = N -1; j >= 0; j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
           col++;
        }
    }
}
