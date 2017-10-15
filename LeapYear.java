/*
*	LeapYear.java
*	
*	Calculate if a year is leap
*	A year is leap year if it is divisible by four, unless it's not divisible 
*	for 100. Years divisible for 400 are leap years	
*
*/

import acm.program.*;

public class LeapYear extends ConsoleProgram {
	
	public void run () {
		
		print("Enter the year: ");
		int year = readInt();
		boolean isLeap = ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
		if (isLeap){
			println("The year " + year + " is a leap year,");
		} else {
			println("The year " + year + " is not a leap year");
		}
	}
}