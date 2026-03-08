package assignment2_2;

public class NetBankingPayment extends Payment{
	
	private String bankName;
	private String accountNumber;
	private String ifscCode;
	
	public NetBankingPayment(String transactionId, double amount, String cutomerName,String bankName, String accountNumber, String ifscCode) {
		super(transactionId,amount,cutomerName);
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}

	public String getBankName() {
		return bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}
	
	public boolean validatePayment() {
		
		 return accountNumber.length() >= 9 && ifscCode.length() == 11;
	}
	
	public boolean processPayment() {
		
		return true;
	}
	
	
}
