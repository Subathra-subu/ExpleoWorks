/*
 * Jagged Array - Column size vary
 */

package multiDimensionalArray;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int arr[][] = new int[3][];
		
		arr[0] = new int[]{1,2,3};
		arr[1] = new int[] {4,5};
		arr[2] = new int[] {7,8,9,10};
		
		System.out.println("Jagged Array:");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
