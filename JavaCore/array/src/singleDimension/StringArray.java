package singleDimension;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
		String[] arr = new String[4];
		
		arr[0] = "Anu";
		arr[1] = "Abi";
		arr[2] = "Karthi";
		
		for(String name:arr)
			System.out.println("Name:"+name);
		
		scanner.close();

	}

}
