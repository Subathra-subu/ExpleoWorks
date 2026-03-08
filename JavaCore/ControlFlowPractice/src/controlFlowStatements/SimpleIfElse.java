package controlFlowStatements;

import java.util.Scanner;

public class SimpleIfElse {

	public static void main(String[] args) {
		
		boolean seatAvailable=true;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the seat number: ");
		String seatNumber = input.next();
		if(seatAvailable) {		//If condition
			System.out.println("You have booked the seat number: "+seatNumber);
		}
		else {
			System.out.println("The booked ticket is not available");
		}
		input.close();

	}

}
