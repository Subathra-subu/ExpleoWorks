/*
 * Program to compute and display the amount to be paid by the customer availing the discount
 */

package hard;

import java.util.Scanner;

public class TotalCostOfPurchasedItems {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Total cost:");
		double total_cost = sc.nextInt();
		
		double discount = 0;
		
		if(total_cost >= 10000)
			discount = (total_cost/100)*50;
		
		else if(total_cost >= 5000)
			discount = (total_cost/100)*35;
		
		else if(total_cost>=2000)
			discount = (total_cost/100)*25;
		
		else
			discount = (total_cost/100)*5;
			
		System.out.print("Total Cost:"+(total_cost-discount));
		
		sc.close();
		

	}

}
