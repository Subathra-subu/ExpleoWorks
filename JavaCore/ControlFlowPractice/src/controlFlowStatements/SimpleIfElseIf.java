package controlFlowStatements;

import java.util.Scanner;

public class SimpleIfElseIf {

	public static void main(String[] args) {
	
		String seatType;
		System.out.println("Type of seats Available\nRegular\nPremium\nExecutive\nVIP\nChoose any one of the option:");
		Scanner input = new Scanner(System.in);
		seatType = input.next();
		if(seatType.equals("Regular")) {
			System.out.println("You have selected Regular seat and cost is 80!");
		}
		else if(seatType.equals("Premium")) {
			System.out.println("You have selected Premium seat and cost is 100!");
		}
		else if(seatType.equals("Executive")) {
			System.out.println("You have selected Executive seat and cost is 120!");
		}
		else if(seatType.equals("VIP")) {
			System.out.println("You have selected VIP seat and cost is 150!");
		}
		else
			System.out.println("You have not selected any seats");
		
		input.close();
	}

}
