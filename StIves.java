/*
*	StIves.java
*	Calculate the number that were going to
*	Sant Ives
*
*/

import acm.program.*;

public class StIves extends ConsoleProgram{
	
	
	public void run(){
		
		println("The man has 7 wives ");
		int wives = 7;
		println("Total Wives: " + wives);
		println("Each wive has 7 sacks");
		int sacks = 7 * wives;
		println("Total sacks: " + sacks);
		println("Each sack has 7 cats");
		int cats = sacks * 7;
		println("Total cats: " + cats);
		println("Each cat has 7 kits");
		int kits = cats * 7;
		println("Total kits: " + kits);
		int total = (wives + sacks + cats+ kits);
		println("The total that were going to Saint Ives are: " + total);
	}
}