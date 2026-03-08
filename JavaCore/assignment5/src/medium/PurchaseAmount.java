/*
 * Program to calculate the purchase amount to be paid after after applying discount
 */

package medium;

import java.util.Scanner;

public class PurchaseAmount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the price:");
		int price = sc.nextInt();
		
		System.out.print("Enter the quantity:");
		int quantity = sc.nextInt();
		
		int purchaseAmount = price*quantity;
		
		int discountAmount = 0;
		int paidAmount=purchaseAmount;
		
		if(purchaseAmount>1000) {
			discountAmount = (purchaseAmount/100)*10;
			paidAmount = purchaseAmount-discountAmount;
		}
		else {
			discountAmount = (purchaseAmount/100)*5;
			paidAmount = purchaseAmount-discountAmount;
		}
		
		System.out.println("The amount to be paid:"+paidAmount);
		
		sc.close();
	}

}
