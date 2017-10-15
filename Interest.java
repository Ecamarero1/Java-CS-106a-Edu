/*
 * 	Interest.java
 * 
 * 	Calculate the interest 
 */

import acm.program.*;

public class Interest extends ConsoleProgram {
	
	public void run(){
	
			println ("Interest calculation program");
			print ("Enter starting balance: ");
			double balance = readDouble();
			print("Enter annual interest rate: ");
			double interes = readDouble();
			Double oneYearBalance = balance*(1+interes/100);
			println("Balance after one year = " + oneYearBalance);
			Double twoYearBalance = oneYearBalance*(1+interes/100);
			println("Balance after two year = " + twoYearBalance);
	}
}
