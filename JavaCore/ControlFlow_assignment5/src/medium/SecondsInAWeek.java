/*
 * Program that calculates how many seconds there are in a week of 7 days
 */

package medium;

public class SecondsInAWeek {

	public static void main(String[] args) {
		
		int seconds = 86400;
		int days = 7;
		
		int secondsPerWeek = 7*86400;
		
		System.out.println("Seconds Per day:"+seconds+" Seconds");
		System.out.println("Days Per week:"+days+" days");
		System.out.println("Seconds Per week:"+secondsPerWeek+" Seconds");
		
	}

}
