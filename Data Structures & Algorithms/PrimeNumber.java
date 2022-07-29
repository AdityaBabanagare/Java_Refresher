/*Problem Description

Given an integer A, you have to tell whether it is a prime number or not.

A prime number is a natural number greater than 1 which is divisible only by 1 and itself. 
==================
Example Input

Input 1:

 3 

Input 2:

 4 
 ===================
 Example Output

Output 1:

 YES 

Output 2:

 NO 
*/

import java.lang.*;
import java.util.*;

public class Main{
  public static void main(Straing[] args){
      
      Scanner sc = new Scanner(System.in);
      
      //take the input number
      int N = sc.nextInt();
      int count = 2;
      for(int i = 2; i < N; i++){
          if( N % i == 0){
              count += 1;
          }
      }
      
      if(count > 2){
          System.out.print("NO");
      } else{
          System.out.print("YES");
      }
  }
}
