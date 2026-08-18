/*
 * Program to check whether the present chocolates can be equally divided among the given number of friends
 */

package hard;

import java.util.Scanner;

public class ChocolateSharing {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the no of friends in a group:");
		int number = scanner.nextInt();
		
		int[] chocolates = new int[number];
		
		System.out.println("Enter the no of chocolates each friend have:");
		
		for(int i=0;i<number;i++) {
			chocolates[i]=scanner.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<number;i++)
			sum+=chocolates[i];
		
		if(sum%number==0)
			System.out.println("Yes! We can divide chocolates equally");
		else 
			System.out.println("No! We can't divide chocolates equally");
		
		scanner.close();
		
		}

}
