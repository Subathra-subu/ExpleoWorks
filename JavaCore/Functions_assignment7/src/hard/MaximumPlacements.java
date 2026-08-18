/*
 * Program to find the department which has highest placements
 */


package hard;

import java.util.Scanner;

public class MaximumPlacements {
	
	static int calculateHighest(int cs,int ec,int me) {
		int max=cs;
		
		if(cs < ec && me < ec) max = ec;
		
		else if (cs < me && ec < me) max = me;
		
		return max;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int max = 0;
		
		System.out.print("Enter the no of students placed in CS:");
		int cs = scanner.nextInt();
				
		System.out.print("Enter the no of students placed in EC:");
		int ec = scanner.nextInt();
				
		System.out.print("Enter the no of students placed in ME:");
		int me = scanner.nextInt();
		
		scanner.close();
		
		if(cs==ec && ec==me) {
			System.out.println("None of the department has got the highest placement");
			return;
		}
		
		else if(cs < 0 || ec < 0 || me < 0) {
			System.out.println("Input is invalid");
			return;
		}
		
		else
			max = calculateHighest(cs,ec,me);
			
		boolean printed = false;
		
		System.out.print("Highest placement ");
		
		if(max==cs) {
			printed=true;
			System.out.print("CS");
		}
		
		if(max==ec) {
			if(printed) System.out.print(" ");
			System.out.print("EC");
		}
		
		if(max==me) {
			if(printed) System.out.print(" ");
			System.out.print("ME");
		}

	}

}
