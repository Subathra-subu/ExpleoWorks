package userInputExamples;

import java.util.Scanner;

public class ReadSomeInput {	//class

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//Object creation
		System.out.print("Enter your name:");
		String name = sc.next();		// Read from user
		System.out.println("Hello!! "+name);
		sc.close();

	}

}
