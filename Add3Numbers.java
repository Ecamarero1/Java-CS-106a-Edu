/*
* Add3Integer.java
* Add 3 diferent numbers and show the
* result
*/

import acm.program.*;

public class Add3Numbers extends ConsoleProgram {
	
	public void run() {
		
		println ("This Program add 3 diferent numbers. ");
		int n1 = readInt("Please give the 1� number: ");
		int n2 = readInt("Please give the 2� number: ");
		int n3 = readInt("Please give the 3� number: ");
		int total = n1 +n2+ n3;
		println("The result of adding the tree nubers is: " + total + ".");
	}
}