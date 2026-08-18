/*
 * Program to display the prime numbers present between the given interval
 */


package medium;

import java.util.Scanner;

public class PrimeNumbersBetweenIntervals {
	
	static boolean isPrime(int n) {
		
		if(n==1) return false;
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the starting interval value:");
		int start = scanner.nextInt();
		
		System.out.print("Enter the ending interval value:");
		int end = scanner.nextInt();
		
		if(start<end) {
		
			System.out.println("Prime numbers between the given interval:");
		
			for(int i=start;i<=end;i++) {
			
				if(isPrime(i)) System.out.print(i+" ");
		
			}
		}
		
		else
			System.out.print("Provide valid input");
		
		scanner.close();
	}

}
