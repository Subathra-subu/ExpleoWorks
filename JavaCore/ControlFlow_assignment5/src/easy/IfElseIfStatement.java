/* Program to check whether the given Character is an Alphabet/ Digit /Special 
 * Symbol using if-else-if statement
 */

package easy;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the character:");
		char c = sc.next().charAt(0);
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			System.out.println("The entered character is Alphabet");
		else if(c>='0' && c<='9')
			System.out.println("The entered character is Digit");
		else
			System.out.println("The entered character is Symbol");
		
		sc.close();

	}

}
