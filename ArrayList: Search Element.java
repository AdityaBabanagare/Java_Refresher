// Search Element in ArrayList
//You are given an integer T (number of test cases). 
//You are given array A and an integer B for each test case. 
//You have to tell whether B is present in array A or not.
//------------------------------------
//inputs:
//First line of the input contains a single integer T.

//Next, each of the test case consists of 2 lines:

//First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
//Second line contains a single integer B
//------------------------------------
//PROGRAM:
//---------

import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for(int i = 0; i < testCases; i++){
            //size of array
            int sizeOfArray = sc.nextInt();

            //declare arraylist
            ArrayList<Integer> arr = new ArrayList<Integer>();

            //take the input
            for(int j = 0 ; j < sizeOfArray; j++){
                arr.add(sc.nextInt());
            }

            //number to find
            int noFind = sc.nextInt();
            int count = 0;
            for(int k = 0; k < sizeOfArray; k++){
                if( arr.get(k) == noFind){
                    count++;
                }
            }

            if(count > 0 ){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }

        }
    }
}
