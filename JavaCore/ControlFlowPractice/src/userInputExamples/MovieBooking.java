package userInputExamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieBooking {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Movie Id: ");
		int movieId = sc.nextInt();
		
		System.out.print("Enter the Movie name: ");
		String movieName = sc.next();
		
		System.out.print("Enter the Movie Description: ");
		String movieDescription= sc.nextLine();
		sc.nextLine();
		
		System.out.print("Enter the Movie Language: ");
		String movieLanguage=sc.next();
		
		System.out.print("Enter the Movie Genre: ");
		String movieGenre = sc.next();
		
		System.out.print("Enter the release date(dd/mm/yyyy): ");
		String date = sc.next();
		SimpleDateFormat moviereleasedate = new SimpleDateFormat("dd/MM/yyyy");
		Date movieDate = moviereleasedate.parse(date);
		
		System.out.print("Enter the Ticket cost: ");
		float ticketCost = sc.nextFloat();
		
		System.out.println();
		
		System.out.println("ENTERED MOVIE DETAILS ARE");
		
		System.out.println("Movie Id: "+movieId);
		System.out.println("Movie Name: "+movieName);
		System.out.println("Movie Description: "+movieDescription);
		System.out.println("Movie Language: "+movieLanguage);
		System.out.println("Movie Genre: "+movieGenre);
		System.out.println("Release Date: "+movieDate);
		System.out.println("Ticket cost: "+ticketCost);
		
		
		sc.close();
	}

}
