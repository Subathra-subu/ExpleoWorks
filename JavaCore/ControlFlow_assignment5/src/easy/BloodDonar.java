/* Program to check whether the person is eligible to donate blood or 
 * not based on their weight and age
 */

package easy;

import java.util.Scanner;

public class BloodDonar {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the age:");
			int age = sc.nextInt();
			
			System.out.print("Enter the weight:");
			int weight = sc.nextInt();
			
			if((age>18 && age<55)&&(weight>45))
				System.out.println("You are eligible to denote blood");
			else
				System.out.println("You are not eligible to denote blood");
			
			sc.close();

	}

}
