package handsOn_7;

import java.util.Scanner;

public class EmailValidation {
	
	static String emailValidation(String mail) {
		
		if(mail.contains("[(a-zA-Z0-9_.-+)+@+(a-zA-Z.+)]")) return "correct";
		
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
