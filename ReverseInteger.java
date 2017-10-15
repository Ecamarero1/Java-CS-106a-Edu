/*
*	ReverseInteger.java
*
*	Ask for a integer	
*	Reverse the digits of a integer
*
*/

import acm.program.*;

public class ReverseInteger extends ConsoleProgram {
	
	public void run (){
		
		println("This program reverse an iteger");
		print("Enter a integer: ");
		int integer = readInt();
		
		int reverse=0;
		while (true){
			reverse += integer %10;
			integer /= 10;
			if ( integer == 0) break;
			reverse *= 10;
		}
		println("The reverse number is: " + reverse);
	}
	
}