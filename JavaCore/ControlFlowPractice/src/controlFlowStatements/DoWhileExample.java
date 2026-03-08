package controlFlowStatements;

public class DoWhileExample {

	public static void main(String[] args) {
		int maxSeatCount = 10,seatCount=0;
		do{
			System.out.println("Current Seat Availablity: "+(maxSeatCount-seatCount));
			seatCount++;
		}while(seatCount < maxSeatCount); 
		System.out.println("Seats are filled");

	}

}
