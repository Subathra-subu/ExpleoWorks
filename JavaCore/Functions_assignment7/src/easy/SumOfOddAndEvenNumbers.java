/*
 * Program to calculate the sum of odd and even numbers
 */


package easy;

import java.util.Scanner;

public class SumOfOddAndEvenNumbers {
	
	static void sum(int n,int[] arr) {
		
		int odd_sum=0;int even_sum=0;
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]%2==0) even_sum += arr[i];
			
			else odd_sum += arr[i];
		}
		
		System.out.println("Sum of odd numbers in an array: "+odd_sum);
		
		System.out.println("Sum of even numbers in an array: "+even_sum);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements:");
		int n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		
		sum(n,arr);
		
		scanner.close();
	}

}
