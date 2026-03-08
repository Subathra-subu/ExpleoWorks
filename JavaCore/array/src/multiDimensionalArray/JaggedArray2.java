package multiDimensionalArray;

import java.util.Scanner;

public class JaggedArray2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        String seatType[][] = new String[3][]; //{{"B","A","A","B","B","A"},{"A","B","B"},{"A","B","B","A","A","B"},{"B","A","B"}};
		
	    for(int j=0;j<3;j++) {
            
	    	System.out.println("Enter the size of column:");
	    	int c = sc.nextInt();
	       
	    	seatType[j]=new String[c];
	    	
	    	for(int i=0;i<c;i++) {
	    	seatType[j][i]=sc.next();
	    	}
	    
	    }
	    
	    int v_total=3,p_total =5,r_total=4;
	    
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
	   
	   sc.close();

	}

}
