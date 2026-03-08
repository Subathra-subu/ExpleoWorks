package assignment;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		Account account1=null;
		Account account2=null;
		
		int choice = 0;
		
		do {
			
			System.out.println("1.Create Account\n2.Credit\n3.Debit\n4.transferTo\n5.Display Account\n6.Exit");
			
			System.out.println("Enter the choice:");
			
			choice = sc.nextInt();

		    switch(choice) {

		        case 1:
		        	System.out.print("Enter ID: ");
	                String id = sc.next();
	                System.out.print("Enter Name: ");
	                String name = sc.next();
	                System.out.print("Enter Balance: ");
	                int balance = sc.nextInt();

	                account1 = new Account(id, name, balance);
	                System.out.println("Account Created Successfully!");
	                break;

		        case 2:
		        	 if (account1 == null) {
		                    System.out.println("Create account first!");
		             } 
		        	 else {
		                    System.out.print("Enter amount to credit: ");
		                    int creditAmt = sc.nextInt();
		                    System.out.println("Updated Balance: " + account1.credit(creditAmt));
		             }
		            break;

		        case 3:
		        	 if (account1 == null) {
		                    System.out.println("Create account first!");
		                } 
		        	 else {
		                    System.out.print("Enter amount to debit: ");
		                    int debitAmt = sc.nextInt();
		                    System.out.println("Updated Balance: " + account1.debit(debitAmt));
		                }
		            break;

		        case 4:
		        	 if (account1 == null || account2 == null) {
		        	        System.out.println("Create both accounts first!");
		        	    } 
		        	    else {
		        	        System.out.print("Enter amount to transfer from Account1 to Account2: ");
		        	        int amount = sc.nextInt();

		        	        account1.transferTo(account2, amount);

		        	        System.out.println("Transfer Completed!");
		        	        System.out.println("Account1 Balance: " + account1.getBalance());
		        	        System.out.println("Account2 Balance: " + account2.getBalance());
		        	    }

		        	    break;
		        	 


		        case 5:
		        	if (account1 == null) {
	                    System.out.println("Create account first!");
	                } 
	        	    else {
	                    System.out.println(account1);
	                }
		            
		            break;

		        case 6:
		            System.exit(0);

		        default:
		            System.out.println("Invalid choice!");
		    }

		} while(choice != 6);
		
		sc.close();
	}
			
}
