/*
*	Fibonacci.java
*	
*	Print the secuence of the fibonacci
*
*/

import acm.program.*;

public class FibonacciTenThousand extends ConsoleProgram {
	
	
	
	public void run(){
		int t1 = 0;
		int t2 = 1;
		
		while (true) {
			println("Fibonacci: " + t1);
			int t3 = t1 +t2;
			t1 = t2;
			if (t1 >= 10000) break;
			t2 = t3;
			
		}
	}
}