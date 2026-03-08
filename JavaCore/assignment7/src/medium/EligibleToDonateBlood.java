/*
 * Program to check whether blood Donar is eligible to donate blood or not based on their age and weight
 */


package medium;

import java.util.Scanner;

public class EligibleToDonateBlood {
	
	static boolean isEligible(int age,int weight) {
		
		if(age > 18 && age <= 55) {
			if(weight > 45)
				return true;
			else
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		
		System.out.print("Enter the age:");
		int age = scanner.nextInt();
		
		System.out.print("Enter the weight:");
		int weight = scanner.nextInt();
		
		if(isEligible(age,weight))
			System.out.println("You are eligible to donate blood");
		else {
			System.out.println("You are not eligible to donate blood");
		}
		
		scanner.close();

	}

}
