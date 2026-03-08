/*
 * Program using multidimensional Array
 */



package multiDimensionalArray;

public class TicketTypes {

	public static void main(String[] args) {
		
		String seatType[][] = new String[][] {{"B","A","A","B","B"},{"A","B","B","A","A"},{"A","B","B","A","A"},{"B","A","B","A","B"}};
		
	    int v_total=5,p_total =10,r_total=5;
	    
	    int v_available=0,p_available=0,r_available=0;
		
		System.out.println("Movie seat Arrangements");
		
		for(int i=0;i<seatType.length;i++) {
			
			for(int j=0;j<seatType[i].length;j++) {
				
				if(i==0 && seatType[i][j].equalsIgnoreCase("A")) 
					v_available++;
				else if(i>0 && i<3 && seatType[i][j].equalsIgnoreCase("A"))
					p_available++;
				else if(i==3 && seatType[i][j].equalsIgnoreCase("A"))
					r_available++;
			}
		}
	   System.out.print("VIP Seats \nAvailable Seats: "+v_available+" Booked Seats: "+(v_total - v_available)+" Total Seats: "+v_total);
			
	   System.out.print("\nPremium Seats \nAvailable Seats: "+p_available+" Booked Seats: "+(p_total - p_available)+" Total Seats: "+p_total);
			
	   System.out.print("\nRegular Seats \nAvailable Seats: "+r_available+" Booked Seats: "+(r_total - r_available)+" Total Seats: "+r_total);
		

	}

}


