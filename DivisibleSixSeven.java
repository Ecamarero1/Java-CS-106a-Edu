/*
*	DivisibleSixSeven.java
*
*	Print all the numbers divisible by 6 or 7 
*	from 1 to 100 	
*
*/

import acm.program.*;

public class DivisibleSixSeven extends ConsoleProgram {
	
	private static final int COUNT = 100;
	
	public void run(){
		
		for (int i=1; i <= COUNT; i++){
			
			if ((i % 6 == 0) || (i % 7 == 0)){
				println(i);
			}
			
		}
	}
}