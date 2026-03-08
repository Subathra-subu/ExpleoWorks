/*
 * Program to sort the elements in an array
 */

package easy;

import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size:");
		int r = scanner.nextInt();
		
		int[]  arr = new int[r];
		
		for(int i=0;i<r;i++) {
			arr[i]=scanner.nextInt();
		}
		
		for(int i=0;i<r-1;i++) {
			for(int j=0;j<r-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<r;i++) {
			System.out.print(arr[i]+" ");
		}
		
		scanner.close();
	
	}

}
