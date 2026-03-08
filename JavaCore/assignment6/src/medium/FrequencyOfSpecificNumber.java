/*
 * Program to display the frequency of specific number if it is present in an array of 25 elements
 */

package medium;

import java.util.Scanner;

public class FrequencyOfSpecificNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] elements = new int[25];
		
		System.out.println("Enter twenty five elements:");
		
		for(int i=0;i<25;i++) {
			elements[i]=scanner.nextInt();
		}
		
		System.out.print("Enter the number to find its frequency:");
		
		int number = scanner.nextInt();
		
		int count=0;
		
		for(int i=0;i<25;i++) {
			if(elements[i]==number) {
				count++;
			}
		}
		
		if(count==0)
			System.out.println("The number is not present in the array");
		else
			System.out.println(number+" appears "+count+" times in the array");
		
		scanner.close();

	}

}
