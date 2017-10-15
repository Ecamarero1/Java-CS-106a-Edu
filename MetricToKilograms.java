/*
*	MetricToKilograms.java
*	Converts weight in kilos to English weight
*/

import acm.program.*;

public class MetricToKilograms extends ConsoleProgram {
	
	private static final double POUND = 2.2;
	private static final double OUNCES = 16;
	
	public void run(){
		
		print("Your weight in kilos: ");
		double kilos = readDouble();
		double pounds = kilos * POUND;
		double ounces = (pounds % 1)* OUNCES;
		println("Your total weight is: " + (int)pounds + " pounds and " + ounces + " ounces." );
	
	}
}
