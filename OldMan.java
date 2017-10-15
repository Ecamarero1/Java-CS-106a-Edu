/*
*	OldMan.java
*
*	The song of the old man, change the number
*	in the firts line ,and the last word at the end
*	of the second line
*
*/

import acm.program.*;

public class OldMan extends ConsoleProgram {
	
	public void run() {
		
		for (int i = 1; i <= 10; i++ ){
			
			String word = "";
			
			switch (i){	
				case 1: word = "thumb"; break;
				case 2: word = "shoe"; break;
				case 3: word = "knee"; break;
				case 4: word = "door"; break;
				case 5: word = "hive"; break;
				case 6: word = "sticks"; break;
				case 7: word = "heaven"; break;
				case 8: word = "pate"; break;
				case 9: word = "spine"; break;
				case 10: word = "shin"; break;
				default: println("hj"); break;	
						
			}
			println("This old man, he played " + i);
			println("He played knick-knack on my " + word);	
			println("With a knick-knack, paddy-whack,");
			println("Give your dog a bone.");
			println("This old man came rolling home.");
			println("");
		}
		
	}
}