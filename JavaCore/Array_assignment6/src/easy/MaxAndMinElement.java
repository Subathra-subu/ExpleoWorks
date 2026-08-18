/*
 * Program to find the minimum and maximum element in an array
 */

package easy;

import java.util.Scanner;

public class MaxAndMinElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size:");
		int r = scanner.nextInt();
		
		int[] array = new int[r];
		
		for(int i=0;i<r;i++) {
			array[i]=scanner.nextInt();
		}
		
		int max=Integer.MIN_VALUE,min = Integer.MAX_VALUE;
		
		for(int i=0;i<r;i++) {
			if(array[i]>max) max=array[i];
			
			if(array[i]<min) min=array[i];
		}
		
		System.out.print("The maximum element in an array:"+max);
		
		System.out.print("\nThe minimum element in an array:"+min);
		
		scanner.close();
		

	}

}
