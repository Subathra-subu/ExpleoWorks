package classExamples;

class TheatreScreen{
	private static int totalSeats = 20;
	
	public TheatreScreen() {
		System.out.println("Current Seat Availability:"+totalSeats);
	}
	
	public void displayTheatreScreen() {
		System.out.println("Current Seat Availability:"+totalSeats);
	}
	
	public void bookedTickets(int noOfTickets) {
		System.out.println("Total Tickets Booked:"+noOfTickets);
		totalSeats-=noOfTickets;
	}
}

public class StaticExample {

	public static void main(String[] args) {
		
		TheatreScreen theatreScreen1 = new TheatreScreen();
		theatreScreen1.bookedTickets(5);
		
		System.out.println();
		
		TheatreScreen theatreScreen2 = new TheatreScreen();
		theatreScreen2.bookedTickets(2);
		
		System.out.println();
		
		theatreScreen2.displayTheatreScreen();
	}

}
