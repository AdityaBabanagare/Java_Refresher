import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long decimalValue = 0;
        int base = 1;

        while(N > 0){
            long rem = N % 10;

            decimalValue = decimalValue + rem*base;

            N /= 10;

            base *= 2;
        }

        System.out.print(decimalValue);
    }
}
