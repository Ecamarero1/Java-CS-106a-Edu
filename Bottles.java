/*
*	Bottles.java
*
*	Generate the songs of 99 bottles
*
*/

import acm.program.*;

public class Bottles extends ConsoleProgram {
	
	public static final int BOTTLES = 99;
	
	public void run () {
		
		for(int i = BOTTLES; i >= 1; i--){
			if (i !=1){
				println(i + " bottles of beer on the wall");
				println(i + " bottles of beer");
				println("You take one down, pass it around.");
				println("");
			} else {
				println(i + " bottle of beer on the wall");
				println(i + " bottle of beer");
				println("You take one down, pass it around.");
			}
			
		}
		
	}
}