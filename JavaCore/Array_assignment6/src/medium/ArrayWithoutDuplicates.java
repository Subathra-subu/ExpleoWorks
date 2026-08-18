/*
 * Program to create a separate array without duplicates
 */

package medium;

import java.util.Scanner;

public class ArrayWithoutDuplicates {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size:");
		int r = scanner.nextInt();
		
		int[] arr = new int[r];
		
		System.out.print("Enter the array elements:");
		
		for(int i=0;i<r;i++) {
			arr[i] = scanner.nextInt();
		}
		
		boolean[] visited = new boolean[r];
		
		int[] new_arr = new int[r];
		
		int index=-1;
		
		for(int i=0;i<r;i++) {
			if(visited[i]==true) continue;
			int count=1;
			for(int j=i+1;j<r;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count==1) new_arr[++index]=arr[i];
		}
		
		
		for(int i=0;i<=index;i++){
			System.out.print(new_arr[i]+" ");
		}
		
		scanner.close();

	}

}
