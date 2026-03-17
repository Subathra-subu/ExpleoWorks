package handsOn_9;

import java.util.HashSet;
import java.util.Scanner;

public class NumbersManipulation_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		System.out.println("Enter a number (or type 'done' to finish): ");
		String input = scanner.next();
		
		scanner.close();
		
		if(input.equals("done")) return;
		
		do {
			
			hashSet.add(Integer.parseInt(input));
			
			System.out.println("Enter a number (or type 'done' to finish): ");
			input = scanner.next();
			
		}while(!input.equals("done"));
		
		
		
		
		
		
		
		

	}

}
