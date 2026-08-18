/*
 * Program to find the number of duplicate and unique elements in a given array
 */


package medium;

import java.util.Scanner;

public class DuplicateAndUniqueElemnts {

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
		
		int unique=0,duplicates=0;
		
		for(int i=0;i<r;i++) {
			if(visited[i]==true) continue;
			int count=1;
			for(int j=i+1;j<r;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count>1) duplicates++;
			else unique++;
		}
		
		System.out.println("Duplicate elements: "+duplicates+"\nUnique elements: "+unique);
		
		scanner.close();

	}

}
