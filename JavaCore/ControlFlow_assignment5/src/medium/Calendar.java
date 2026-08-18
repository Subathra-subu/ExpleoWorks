package medium;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the month number(1-12):");
		int month = scanner.nextInt();
		
		System.out.print("Enter the start day of the month(1-7):");
		int Start_day = scanner.nextInt();
		
		int days=0;
		
		switch(month) {
			case 1,3,5,7,8,10,12:
				days = 31;
				break;
			case 2:
				System.out.print("Enter no of days:");
				days = scanner.nextInt();
				break;
			case 4,6,9,11:				days = 30;
				break;
			default:
				System.out.print("Enter valid month");
		}
		
		System.out.println("M  T  W  Th  F  Sa  S");
		
		for(int i=0;i<Start_day-1;i++) {
			System.out.printf("%-3s","");
		}
		
		for(int j=1;j<=days;j++) {
			if(j<10)
				System.out.printf("%-3d",j);
			else
				System.out.printf("%-3d",j);
			
			if((j+Start_day-1)%7==0) System.out.println();
		}
		
		scanner.close();
	}

}
