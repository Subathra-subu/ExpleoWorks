/*
 * Program to check whether an array contains the given element or not
 */


package medium;

import java.util.Scanner;

public class PresentOfSpecificElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int r = scanner.nextInt();
		
		int[] arr = new int[r];
		
		System.out.println("Enter the array elemnts:");
		
		for(int i=0;i<r;i++) {
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the key element:");
		int key = scanner.nextInt();
		
		scanner.close();
		
		for(int i=0;i<r;i++) {
			if(arr[i]==key) {
				System.out.print("true");
				return;
			}
		}
		
		System.out.print("false");
		
		
	}

}
