/*
*	Circle.java
*	Ask to the user about the radius of a 
*	circle and calculate the area 
*	*
*/

import acm.program.*;

public class CircleArea extends ConsoleProgram{

	private static final double PI = 3.1416; 
	
	public void run(){
		
		print("Enter the radius of the circle: ");
		double radius = readDouble();
		double area = PI*(radius*radius);
		print("The Area of the circle is: " + area);
	}
}