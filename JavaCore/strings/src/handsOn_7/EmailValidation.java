package handsOn_7;

import java.util.Scanner;

public class EmailValidation {
	
	static String emailValidation(String mail) {
		
		if(mail.contains("^[A-Za-z](?:[A-Za-z0-9]|[._-](?=[A-Za-z0-9]))*@[A-Za-z0-9]+(?:-[A-Za-z0-9]+)*(?:\\.[A-Za-z0-9]+(?:-[A-Za-z0-9]+)*)+$\"")) return "correct";
		
		return "Incorrect";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Email:");
		String email = sc.next();
		
		System.out.println("Email: "+emailValidation(email));
		
		sc.close();

	}
}
