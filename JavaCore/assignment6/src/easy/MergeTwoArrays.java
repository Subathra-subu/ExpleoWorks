/*
 * Program to merge two arrays into a third array and Display the values of three arrays
 */

package easy;

import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size1:");
		int r1  =scanner.nextInt();
		
		int[] arr1 = new int[r1];
		
		System.out.println("Enter array1 elements");
		
		for(int i=0;i<r1;i++) {
			arr1[i]=scanner.nextInt();
		}
		
		System.out.print("Enter the size2:");
		int r2  =scanner.nextInt();
		
		int[] arr2 = new int[r2];
		
		System.out.println("Enter array2 elements");
		
		for(int i=0;i<r2;i++) {
			arr2[i]=scanner.nextInt();
		}
		
		int[] merge_arr = new int[r1+r2];
		
		int k=0;
		
		for(int i=0;i<r1;i++) {
			merge_arr[k++]=arr1[i];
		}
		
		for(int j=0;j<r2;j++) {
			merge_arr[k++]=arr2[j];
		}
		
		System.out.println("After merging two arrays:");
		
		for(int j=0;j<merge_arr.length;j++) {
			System.out.print(merge_arr[j]+" ");
		}
		
		scanner.close();
		
	}

}
