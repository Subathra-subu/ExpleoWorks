/* Program  displays "Hello" for integer value and terminate the 
 * program for negative values
 */


package easy;

import java.util.Scanner;

public class PrintHello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("Enter the number:");
			num = sc.nextInt();
			int count=1;
			while(count<=num) {
				System.out.println("Hello");
				count++;
			}
		}while(num>0);
		
		sc.close();

	}

}
