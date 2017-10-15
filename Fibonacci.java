/*
*	Fibonacci.java
*	
*	Print the secuence of the fibonacci
*
*/

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	private static final int FIBONACCI = 16;
	
	public void run(){
		int t1 = 0;
		int t2 = 1;
		for (int i = 0 ; i < 10000; i++) {
			println("Fibonacci "+ i + ": " + t1);
			int t3 = t1 +t2;
			t1 = t2;
			t2 = t3;
		}
	}
}