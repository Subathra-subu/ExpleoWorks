package handsOn_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class NumbersManipulation_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		System.out.println("Enter a number (or type 'done' to finish): ");
		String input = scanner.next();
		
		do {
			
			if(!arrayList.contains(Integer.parseInt(input)))
				arrayList.add(Integer.parseInt(input));
			
			System.out.println("Enter a number (or type 'done' to finish): ");
			input = scanner.next();
			
		}while(!input.equals("done"));
		
		scanner.close();
		
		Collections.sort(arrayList);
		
		LinkedList<Integer> evenList = new LinkedList<Integer>();
		
		int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE,sum=0;
		
		for(Integer integer : arrayList) {
			sum+=integer;
			if(integer%2==0) evenList.add(integer);
			
			if(min > integer) min = integer;
			if(max < integer) max = integer;
		}
		
		System.out.println("Sorted unique number: "+arrayList);
		
		System.out.println("Even Numbers in the list: "+evenList);
		
		System.out.println("Minimum number in the list: "+min);
		
		System.out.println("Maximum number in the list: "+max);
		
		System.out.println("Average of the list: "+((double) sum / arrayList.size()));
		
		}

}
