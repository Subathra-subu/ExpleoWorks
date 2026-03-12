package handsOn_8;

import java.util.Scanner;

public class MyCalculator {
	
	static int power(int n,int p) {
		return (int)Math.pow(n, p);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the value of n:");
		int n = scanner.nextInt();
		System.out.print("Enter the value of p:");
		int p = scanner.nextInt();
		
		scanner.close();
		
		try {
			if(n==0 && p==0) throw new Exception("n and p should not be zero.");
			else if(n==0 || p==0) throw new Exception("n or p should not be negative.");
			else System.out.println(power(n,p));
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
