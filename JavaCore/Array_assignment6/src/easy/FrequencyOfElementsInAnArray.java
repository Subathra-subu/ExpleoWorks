/*
 * Program to find the frequency of each element in a positive elements array
 */

package easy;

import java.util.Scanner;

public class FrequencyOfElementsInAnArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size:");
		int r = scanner.nextInt();
		
		int[] arr = new int[r];
		
		for(int i=0;i<r;i++) {
			arr[i]=scanner.nextInt();
		}
		
		boolean[] visited = new boolean[r];
		
		for(int i=0;i<r;i++){
			if(visited[i]==true) continue;
			int count=1;
			for(int j=i+1;j<r;j++) {
				if(arr[i]==arr[j]) { 
					count++;
					visited[j]=true;
				}
			}
			System.out.print(arr[i]+" "+count+" times");
			System.out.println();
		}
		
		scanner.close();
	}

}
