// Program to check whether the given number is divisor of 7

package easy;

import java.util.Scanner;

public class CheckDivisorOf7 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int number = sc.nextInt();
		
		if(number%7==0)
			System.out.println("The number is divisor of 7");
		else
			System.out.println("The number is not divisor of 7");
		
		sc.close();

	}

}
