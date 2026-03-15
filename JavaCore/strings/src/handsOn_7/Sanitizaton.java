package handsOn_7;

import java.util.Scanner;

public class Sanitizaton {
	
	public static void sanitize(String user,String password,String ip,String status) {
		System.out.print("User= "+user+"; Password= **********; IP= xxx.xxx.xxx.xxx; Status= "+status);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter User Name:");
		String userName = scanner.next();
		
		System.out.print("Enter Password:");
		String password = scanner.next();
		
		System.out.print("Enter IP:");
		String ip = scanner.next();
		
		System.out.print("Enter Status:");
		String status = scanner.next();
		
		sanitize(userName,password,ip,status);
		
		scanner.close();

	}

}
