/*
 * Program to calculate bill of a job work done
 */


package medium;

import java.util.Scanner;

public class JobWorkCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of pages:");
		int pages = sc.nextInt();
		
		System.out.print("Enter number of copy needed:");
		int copy = sc.nextInt();
		
		int total_cost;
		int typing_cost = pages*3;
		int print_cost;
		
		if(copy==1)
			print_cost = pages*1;
		else
			print_cost = (pages*1)+ ((copy-1)*pages*3);
		
		total_cost = typing_cost+print_cost;
		
		System.out.println("Total Cost:"+total_cost);
		
		sc.close();
		}

}
