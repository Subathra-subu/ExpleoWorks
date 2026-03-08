/*
 * Program to read the input until the user enters negative number and 
 * change the array elements based on the given condition
 */

package hard;

import java.util.Scanner;

public class ProcessArray {
	
	static void changeArray(int[] arr,int size) {
	
		for(int j=0;j<size;j++) {
			
			if(arr[j]%7==0 && arr[j]%8==0)
				arr[j]=-6;
		
			else if(arr[j]%7==0) 
				arr[j]=-2;
		
			else if(arr[j]%8==0)
				arr[j]=-9;
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[100];
		
		int i=0;
		
		while(true) {
			System.out.print("Enter the element:");
			arr[i] = scanner.nextInt();
			if(arr[i] < 0) break;
			i++;
		}
		
		changeArray(arr,i);
		
		for(int j=0;j<i;j++) {
			System.out.print(arr[j]+" ");
		}
		
		scanner.close();
		
	}

}
