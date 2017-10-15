/*
*	Factorial.java
*	
*	Display all the factorial numbers from a 
*	minimum to a maximum numbers
*
*/

import acm.program.*;

public class FactorialTable extends ConsoleProgram {
	
	private static final int MINIMUM = 0;
	private static final int MAXIMUM = 15;
	
	public void run () {
		
		for (int i = MINIMUM; i <= MAXIMUM; i++){
			
			println("The factorial of: " + i + " is " + factorial(i));
		}	
	}	
	private long factorial (long n){
		
		int result = 1;
		for (int i=1; i<=n; i++){
			result *= i;
		}
		return result;
	}		
}