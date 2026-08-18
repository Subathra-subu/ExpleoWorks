/*
 * Program to calculate the difference between even and odd sum within the given upper and lower bounds
 */


package medium;

import java.util.Scanner;

public class DifferenceBetweenOddAndEvenSum {
	
	int oddSum(int upper,int lower) {
		int total=0;
		
		for(int i=lower;i<=upper;i++) {
			if(i%2!=0)
			    total+=i;
		}
		
		System.out.print("Sum of odd number:"+total);
		
		return total;
			
	}
	
	int evenSum(int upper,int lower) {
		int total=0;
		
		for(int i=lower;i<=upper;i++) {
			if(i%2==0)
				total+=i;
		}
		
		System.out.print("\nSum of odd number:"+total);
		
		return total;
			
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the lower bound:");
		int lower = scanner.nextInt();
		
		System.out.print("Enter the upper bound:");
		int upper = scanner.nextInt();
		
		DifferenceBetweenOddAndEvenSum d = new DifferenceBetweenOddAndEvenSum(); 
		
		int difference = Math.abs(d.oddSum(upper,lower) - d.evenSum(upper,lower));
		
		System.out.print("\nDifference between odd and even sum: "+difference);
		
		scanner.close();
		
	    }

}
