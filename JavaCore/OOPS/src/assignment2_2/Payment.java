package assignment2_2;

abstract public class Payment {
	
	protected String transactionId;
	protected double amount;
	protected String cutomerName;
	protected String paymentStatus;
	
	public Payment(String transactionId, double amount, String cutomerName) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.cutomerName = cutomerName;
		this.paymentStatus = "Pending";
	}

	public String getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public String getCutomerName() {
		return cutomerName;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	abstract boolean validatePayment();
	
	abstract boolean processPayment();
	
	public void executeTransaction() {
		
	    if (validatePayment()) {
	    	
	    	if (processPayment())
	            setPaymentStatus("Success"); 
	    	
	    	else
	            setPaymentStatus("Failed");
	    } 
	    
	    else
	        setPaymentStatus("Validation Failed");

	    generateReceipt();

		
	}
	
	public void generateReceipt() {
		System.out.println("\n----- PAYMENT RECEIPT -----");
	    System.out.println("Transaction ID : " + transactionId);
	    System.out.println("Customer Name  : " + cutomerName);
	    System.out.println("Amount         : " + amount);
	    System.out.println("Status         : " + paymentStatus);
	    System.out.println("----------------------------\n");
	}
	
}
