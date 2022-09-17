//Building Sieve of Eratosthenes for getting the prime numbers

//The sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than n when n is smaller than 10 million or so

//code:

import java.util.*;
import java.lang.*;

public class Main{
  public static void main(String[] args){
    
    //take the input number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number till where you want to print the prime numbers: ");
    int N = sc.nextInt();
    
    //Building Sieve of Eratosthenes
    
    boolean[] sieve = new boolean[N+1];
    for(int i = 0; i < N+1; i++){
      sieve[i] = true;
    }
    sieve[0] = false;
    sieve[1] = false;
    
    for(int i = 2; i < N+1; i++){
      if(sieve[i] == true){
        for(int j = i*i; j < N+1; j = j+i){
          sieve[j] = false;
        }
      }
    }
    
    //end of sieve
    
    //print the primes
    System.out.println("The Prime numbers are: ");
    
    for(int i = 0; i <= N; i++){
        if(sieve[i] == true){
            System.out.print(i + " ");
        }
      
    }
    
  }
}
