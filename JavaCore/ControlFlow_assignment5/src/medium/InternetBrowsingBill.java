// Program to calculate bill for Internet browsing

package medium;

import java.util.Scanner;

public class InternetBrowsingBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter hours:");
		int hours = sc.nextInt();
		
		System.out.print("Enter minutes:");
		int minutes = sc.nextInt();
		
		sc.close();
		
		int total_bill=0;
		
		if(hours>7 || (hours==7 && minutes > 0)) {
			System.out.print("You can't browse more than 7 hours");
			return;
		}
		
		if(hours >= 0 && (minutes>=0 && minutes<60)) {
			total_bill += (hours*50);
			total_bill += (minutes*1);
		}
		else {
			System.out.print("Invalid time");
			return;
		}
		
		if(hours==5) {
			total_bill-=50;
		}
		
		System.out.println("Total Bill for Internet Browsing:"+total_bill);
		

	}

}
