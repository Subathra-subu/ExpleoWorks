/*
 * Program to check whether the person is eligible to vote or not based on their age
 */


package easy;

import java.util.Scanner;

public class EligibleToVote {
	
	static boolean isEligible(int age) {
		if(age>=18) return true;
		else return false;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age:");
		int age = scanner.nextInt();
		
		if(isEligible(age))
			System.out.println("You are eligible to vote");
		else 
			System.out.println("You are not eligible to vote");
		
		scanner.close();
	}

}
