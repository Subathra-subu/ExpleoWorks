/*
 * Program to find the given number is a factorial of which number
 */

package hard;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int number = sc.nextInt();
		
		
		if(number>=1) {
			int value = 1;
			boolean isFact = false;
			int i=1;
		
			while(value <= number) {
				
				value*=i;
				
				if(value == number) {
					isFact=true;
					break;
				}
				i++;
			}
		
		if(isFact==true)
			System.out.print(i);
		else
			System.out.print("Sorry.The given number is not a perfect factorial");
		}
		else
			System.out.print("Invalid input");
		
		sc.close();

	}

}
