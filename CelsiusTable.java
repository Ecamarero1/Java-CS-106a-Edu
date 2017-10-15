/*
*	CelsiudTable.java
*
*	Display a list of Celsius temperature from a 
*	minimum to a maximum values and his equivalent 
*	temperature in Fahrenheit 
*
*/

import acm.program.*;

public class CelsiusTable extends ConsoleProgram {
	
	private static final int MINIMUM = 0;
	private static final int MAXIMUM = 100;
	private static final int STEP = 5;
	
	public void run () {
		
		for ( int i = MINIMUM; i <= MAXIMUM; i += STEP){
			
			println(i + " Celsius is : " + Fahrenheit(i) + " Fahrenheit." );
		}
	}
	private double Fahrenheit (double x){
		return 9.0 / 5.0 * x + 32;
	}
}