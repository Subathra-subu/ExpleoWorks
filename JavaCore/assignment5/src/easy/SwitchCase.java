/*
 * Program to print the appropriate message to recognize the entered 
 * character is vowel, consonant or symbol
 */

package easy;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character:");
		char c = sc.next().charAt(0);
		
		switch(c) {
			
		case 'a','e','i','o','u','A','E','I','O','U':
			System.out.println("The entered character is vowel");
			break;

		default :
			if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z'))
				System.out.println("The entered character is Consonant");
			else
				System.out.println("The entered character is Symbol");
			
		}
		sc.close();

	}

}
