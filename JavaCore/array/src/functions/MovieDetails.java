/*
 * Program to get movie details and display it through function concept
 */

package functions;

import java.util.Scanner;

public class MovieDetails {
	
	static void getMovieDetails(String movie_name,String movie_description,int movie_duration,String movie_language,String movie_releasedate,String movie_genre,String movie_country) {
		System.out.println("\nMovie Details");
		System.out.println("Movie Name:"+movie_name);
		System.out.println("Movie Description:"+movie_description);
		System.out.println("Movie Duration:"+movie_duration);
		System.out.println("Movie Language:"+movie_language);
		System.out.println("Movie Release Date:"+movie_releasedate);
		System.out.println("Movie Genre:"+movie_genre);
		System.out.println("Movie Country:"+movie_country);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter movie Name:");
		String movie_name = scanner.next();
		
		System.out.print("Enter movie Description:");
		String movie_description = scanner.next();
		
		System.out.print("Enter movie Duration:");
		int movie_duration = scanner.nextInt();
		
		System.out.print("Enter movie Language:");
		String movie_language = scanner.next();
		
		System.out.print("Enter movie Release date:");
		String movie_releasedate = scanner.next();
		
		System.out.print("Enter movie Genre:");
		String movie_genre = scanner.next();
		
		System.out.print("Enter movie country:");
		String movie_country = scanner.next();
		
		getMovieDetails(movie_name,movie_description,movie_duration,movie_language,movie_releasedate,movie_genre,movie_country);
		
		scanner.close();

	}

}
