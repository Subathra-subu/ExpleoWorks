/*
 * Program to calculate the overtime pay for 5 Employees
 */

package medium;

import java.util.Scanner;

public class OverTimePay {
	
	static double toCalculatePay(int arr[]) {
		
		double total = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>40) total+=(arr[i]*15.0);
		}
		
		return total;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter 5 employees working hours:");
		
		int[] working_hours = new int[5];
		
		for(int i=0;i<5;i++) {
			working_hours[i] = scanner.nextInt();
		}
		
		System.out.println("Total pay of overtime for 5 Employees:"+toCalculatePay(working_hours));
		
		scanner.close();

	}

}
