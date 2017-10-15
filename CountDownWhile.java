/*
*	CountDownWhile.java
*	
*	Count down from 10 to 0 using a
*	while loop instead a for loop
*
*/

import acm.program.*;

public class CountDownWhile extends ConsoleProgram {
	
	private static final int COUNT = 10;
	
	public void run() {
		
		int i = COUNT;
		while (true) {
			println(i);
			i--;
			if (i < 0) break;
		}
		println("Launch rocket!!!!!");
	}
}