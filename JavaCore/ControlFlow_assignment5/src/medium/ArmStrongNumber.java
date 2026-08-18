// Program to check whether the given number is ArmStrong number or Not

package medium;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		
		int num = sc.nextInt();
		
		int temp1 = num;
		
		int count=0;
		
		while(temp1>0) {
			count++;
			temp1/=10;
		}
		
		int temp2 = num;
		int armNum = 0;
		
		while(temp2>0) {
			int digit = temp2%10;
			int i=count;
			int value=1;
			while(i>0) {
				value*=digit;
				i--;
			}
			armNum+=value;
			temp2/=10;
		}
	
		if(armNum==num)
			System.out.print("The entered number is ArmStrong number");
		else
			System.out.print("The entered number is not ArmStrong number");
		
		sc.close();

	}

}
