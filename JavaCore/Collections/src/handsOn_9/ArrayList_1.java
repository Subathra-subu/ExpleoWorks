package handsOn_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many names do you want to input?");
		int n = scanner.nextInt();
		
		scanner.nextLine();
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		int count = 0;
		
		while(count < n) {
			
			System.out.print("Enter name #"+(count+1)+":");
			
			String name = scanner.nextLine();
			
			arrayList.add(name);
			
			count++;
		}
		
		System.out.println("Names longer than 5 characters:");
		
		Iterator<String> itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			if(name.length() > 5)
				System.out.println(name);
		}
		
		scanner.close();

	}

}
