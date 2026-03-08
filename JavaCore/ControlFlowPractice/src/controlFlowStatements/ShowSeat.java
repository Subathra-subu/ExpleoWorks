package controlFlowStatements;

public class ShowSeat {

	public static void main(String[] args) {
		int maxSeatCount = 10,seatCount=0;
		while(seatCount < maxSeatCount) {
			System.out.println("Current Seat Availablity: "+(maxSeatCount-seatCount));
			seatCount++;
		}
		System.out.println("Seats are filled");
	}

}
