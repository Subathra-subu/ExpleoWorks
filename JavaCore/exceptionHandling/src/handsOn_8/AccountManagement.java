package handsOn_8;

import java.util.Scanner;

class PayOutOfBoundsException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	PayOutOfBoundsException(String s){
		super(s);
	}
}

public class AccountManagement {
	
	private static double  balance = 80000;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double amount) {
		balance = amount;
	}

	public boolean checkForDebit(double amount) {
		
		if(amount > getBalance() || amount > 30000)
			return false;
		
		return true;
	}
	
	void withdrawAmount(double amount) {
		
		double balance = getBalance() - amount;
		setBalance(balance);
		System.out.println("Amount Withdrawn Successfully!!\nBalance : "+getBalance());
	
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the amount to Withdraw:");
		double amount = scanner.nextDouble();
		
		scanner.close();
		
		try {
			
			AccountManagement accountManagement = new AccountManagement();
			
			if(accountManagement.checkForDebit(amount))
				accountManagement.withdrawAmount(amount);
			
			else throw new PayOutOfBoundsException("The transaction amount exceeds the limit or the amount is insufficient");
		}
		catch(Exception e) {
			System.out.println("Error Occured: "+e);
		}
	}

}
