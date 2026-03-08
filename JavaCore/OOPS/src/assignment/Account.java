package assignment;

public class Account {
	
	private String id;
	private String name;
	private int balance;
	
	Account(String id,String name){
		this.id = id;
		this.name = name;
		this.balance = 0;
	}
	
	Account(String id,String name,int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBalance(int amount) {
		balance = amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int credit(int amount) {
		balance+=amount;
		return balance;
	}
	
	public int debit(int amount) {
		
		if(amount>balance) {
			System.out.println("Amount Exceeded Balance");
			return balance;
		}
		balance-=amount;
		return balance;
		
	}
	
	public int transferTo(Account account,int amount) {
		
		if(this.balance < amount) {
			System.out.println("Amount Exceeded Balance");
			return balance;
		}
		
		account.credit(amount);
		
		this.debit(amount);
		
		return this.balance;
		
	}
	
	public String toString() {
		return "Account Details: \nAccount Id: "+id+"\nAccount holder name: "+name+"\nBalance: "+balance;
	}
	
	
}
