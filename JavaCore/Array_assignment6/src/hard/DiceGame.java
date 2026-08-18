/*
 * Program to find the winner in dice game by comparing the each values of two members
 */


package hard;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int times = 10;
		
		int[] arun = new int[times];
		
		System.out.println("Enter the Arun dice values:");
		
		for(int i=0;i<times;i++) {
			arun[i] = scanner.nextInt();
		}
		
		int[] naveen = new int[times];
		
		System.out.println("Enter the naveen dice values:");
		
		for(int i=0;i<times;i++) {
			naveen[i] = scanner.nextInt();
		}
		
		int arun_count=0,naveen_count=0;
		
		for(int i=0;i<times;i++) {
			if(arun[i]>naveen[i]) arun_count++;
			else if(arun[i]<naveen[i]) naveen_count++;
		}
		
		if(arun_count>naveen_count)
			System.out.println("Arun Wins!!");
		else if(arun_count<naveen_count)
			System.out.println("Naveen Wins!!");
		else
			System.out.println("The match is draw!!");
		
		scanner.close();

	}

}
