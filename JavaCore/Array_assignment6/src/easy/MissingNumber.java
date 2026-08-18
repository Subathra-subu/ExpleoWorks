/*
 * Program to find the missing number in an array
 */


package easy;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[99];
		
		System.out.println("Enter the array elements:");
		
		int sum=0;
		
		for(int i=0;i<99;i++) {
			arr[i]=scanner.nextInt();
			sum+=arr[i];
		}
		
		int total = 100*(100+1)/2;
		
		System.out.print("Missing Number:"+(total-sum));
		
		scanner.close();
		
	}

}
