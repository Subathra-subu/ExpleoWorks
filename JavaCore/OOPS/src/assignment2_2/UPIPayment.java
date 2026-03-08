package assignment2_2;

public class UPIPayment extends Payment {
	
	private String upiId;
	private String upiPin;
	
	public UPIPayment(String transactionId, double amount, String cutomerName,String upiId, String upiPin) {
		super(transactionId, amount, cutomerName);
		this.upiId = upiId;
		this.upiPin = upiPin;
	}

	public String getUpiId() {
		return upiId;
	}

	public String getUpiPin() {
		return upiPin;
	}

	public boolean validatePayment() {
		 
		return upiId.contains("@") && upiId.length()>= 3
				&& upiPin.length() == 4;
		
	}
	
	public boolean processPayment() {
		
		return true;
		
	}

}
