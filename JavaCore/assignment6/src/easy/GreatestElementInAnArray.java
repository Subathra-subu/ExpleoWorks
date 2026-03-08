/*
 * Program to find greatest element in an array
 */


package easy;

import java.util.Scanner;

public class GreatestElementInAnArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size:");
		int r = scanner.nextInt();
		
		int[] arr = new int[r];
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<r;i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int i=0;i<r;i++) {
			if(max<arr[i]) max=arr[i];
		}
		
		System.out.println("Greatest element in an array: "+max);
		
		scanner.close();
		
	}

}
