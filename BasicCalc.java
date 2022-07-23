import java.util.*;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the operation: \n1.Add \n2.Sub");
		
		int opr = sc.nextInt();
		
		switch (opr){
			case 1:
			    System.out.print("Please enter 2 numbers to add: ");
			    double num1 = sc.nextDouble();
			    double num2 = sc.nextDouble();
			    int sum = (int)(num1 + num2);
			    System.out.println( num1 + " + " + num2 + " = " + sum);
			    break;
			
			case 2:
			    System.out.print("Please enter 2 numbers to add: ");
			    double num3 = sc.nextDouble();
			    double num4 = sc.nextDouble();
			    int sub = (int)(num3 - num4);
			    System.out.println( num3 + " - " + num4 + " = " + sub);
			    break;
			
			default:
			System.out.println("Please re-run with correct option");
		}
	}
}
