/* Program to calculate Total Expenses by applying discount 
 * when total quantity is more than 500
 */


package medium;

import java.util.Scanner;

public class TotalExpensesOfMark {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount:");
		int amount = sc.nextInt();
		
		int totalExpenses=amount;
		int discount = 0;
		
		if(totalExpenses > 500)
			 discount =(totalExpenses/100)*15;
		
		System.out.println("The total Expenses after discount:"+(totalExpenses-discount));
		
		sc.close();
			

	}

}
