/*
*	Average4.java
*	
*Computes the average of 4 integers
*
*/

import acm.program.*;

public class Average4 extends ConsoleProgram  {
	
	public void run(){
		
		print("Enter the firts integer: ");
		int firts = readInt();
		print("Enter the second integer: ");
		int second = readInt();
		print("Enter the trird integer: ");
		int trird = readInt();
		print("Enter the fourth integer: ");
		int fourth = readInt();
		double average = (firts + second + trird + fourth)/4;
		println("The average of the integers is: " + average);
	}
}