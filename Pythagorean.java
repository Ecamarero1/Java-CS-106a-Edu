/*
*	Pytagorean.java
*
*	Calculate the
*
*/
import acm.program.*;

public class Pythagorean extends ConsoleProgram {
	
	public void run() {
	
		println("Enter values to compute Pithagorean theorem.");
		int a = readInt("a: ");
		int b = readInt("b: ");
		
		double y = Math.sqrt(a*a+b*b);
		println("c: " + y);
	}
}