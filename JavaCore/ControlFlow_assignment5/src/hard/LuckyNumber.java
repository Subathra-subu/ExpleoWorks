/*
 * Program to check whether the entered four digit number which is divisible of 3 or 5 or 7
 */

package hard;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int number = sc.nextInt();
		
		if(number >= 1000 && number <= 9999) {
			int temp = number;
			int sum=0;
			while(temp>0) {
				sum+=(temp%10);
				temp/=10;
			}
			if(sum%3==0 || sum%5==0 || sum%7==0)
				System.out.println("Lucky Number");
			else 
				System.out.println("Sorry it's not my lucky number");
		}
		
		else
			System.out.println(number+" is not a valid car number");
		
		sc.close();
		
	}

}
