/*
*	Fahrenheit.java
*
*	Aks to user for the temperature in Fahrenheit and
*	gives you the temperature in Celsius
*
*/

import acm.program.*;
	
public class FahrenheitToCelsius extends ConsoleProgram {
		
	public void run(){
		
		println("This program converts Fahrenheit to Celsius.");
		print("Enter Fahrenheit temperature: ");
		double fahrenheit = readDouble();
		double celsius = (double)5/9*(fahrenheit-32);
		print("Celsius equivalent =  " + celsius);
	}
}