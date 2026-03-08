package hard;

import java.util.Scanner;


public class MergeandSortThreeArrays {
	
	static void sort(int[] merge_arr) {
		
		for(int i=0;i<merge_arr.length-1;i++) {
			for(int j=0;j<merge_arr.length-i-1;j++) {
				if(merge_arr[j]>merge_arr[j+1]) {
					int temp = merge_arr[j];
					merge_arr[j] = merge_arr[j+1];
					merge_arr[j+1] = temp;
				}
			}
		}
	}

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
		
		int[] arr2 = new int[r1];
		
		System.out.println("Enter array2 elements");
		
		for(int i=0;i<r2;i++) {
			arr2[i]=scanner.nextInt();
		}
		
		System.out.print("Enter the size3:");
		int r3  =scanner.nextInt();
		
		int[] arr3 = new int[r1];
		
		System.out.println("Enter array3 elements");
		
		for(int i=0;i<r3;i++) {
			arr3[i]=scanner.nextInt();
		}
		
		int[] merge_arr = new int[r1+r2+r3];
		
		int k=0;
		
		for(int i=0;i<r1;i++) {
			merge_arr[k++]=arr1[i];
		}
		
		for(int j=0;j<r2;j++) {
			merge_arr[k++]=arr2[j];
		}
		
		for(int l=0;l<r3;l++) {
			merge_arr[k++]=arr3[l];
		}
		
		sort(merge_arr);
		
		System.out.println("After merging and sort the three arrays:");
		
		for(int j=0;j<merge_arr.length;j++) {
			System.out.print(merge_arr[j]+" ");
		}
		
		scanner.close();
		

	}

}
