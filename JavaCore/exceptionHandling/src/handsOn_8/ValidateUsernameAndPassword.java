package handsOn_8;

import java.util.Scanner;

public class ValidateUsernameAndPassword {
	
	static boolean isValidUser(String s) {
		if (s.length() >= 6 && s.length() <= 30 && s.matches("^[A-Za-z][A-Za-z0-9_]*$"))
				return true;
		return false;
	}
	
	static boolean isValidPassword(String s) {
		if(s.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()\\-\\+]).{8,}$"))
			return true;
		return false;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter UserName:");
		String userName = scanner.next();
		
		System.out.print("Enter Password:");
		String password = scanner.next();
		
		scanner.close();
		
		try {
			if(!isValidUser(userName))
				throw new Exception("InvalidUsernameException");
			else if(!isValidPassword(password))
				throw new Exception("InvalidPasswordException");
			else 
				System.out.println("Welcome "+userName);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
