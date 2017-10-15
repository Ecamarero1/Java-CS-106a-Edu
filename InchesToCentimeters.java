/*
*	InchesToCentimeter.java
*	07/10/17
*	Converts feet and Inches to centimeters
*
*/

import acm.program.*;

public class InchesToCentimeters extends ConsoleProgram {
	
	public void run() {
	
		print("Enter the number of feets: ");
		int feets = readInt();
		print("Enter the number of inches: ");
		int inches = readInt();
		double totalcentimeters = (double)(feets*INCHES_PER_FOOT + (inches)) * CENTIMETERSTOINCHES;
		println(feets + "ft and " + inches + "in = " + totalcentimeters + "cm");		
	}
	
	private static final int INCHES_PER_FOOT = 12;
	private static final double CENTIMETERSTOINCHES = 2.54;
}