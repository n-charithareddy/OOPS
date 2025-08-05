package week2;

import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		/*Develop a Java program to display the current date and time.
		 * Also demonstrate different date and time methods available in Date class.
		 */
		Date current = new Date();
		System.out.println("Current date and Time: " + current);
		
		System.out.println("Time in milliseconds: " + current.getTime());
		System.out.println("Current Hour: " + current.getHours());
		System.out.println("Current Minutes: " + current.getMinutes());
		System.out.println("Current Seconds: " + current.getSeconds());
	}

}
