/*
*	AverageList.java
*	
*	Read imputs from the user and then calculate
*	the average, the SENTINEL value is -1
*
*/

import acm.program.*;

public class AvegareList extends ConsoleProgram {
	
	private static final int SENTINEL = -1;
	
	public void run() {
		
		println("Enter number of exam scores to calculate");
		println("the average, the SENTINEL to stop the program is: -1");
		println("");
		
		int count = 0;
		int total =0;
		while (true){
			print("Enter exam score: ");
			
			int score = readInt();
			if (score == SENTINEL) break; {
				total += score;
				count++;
			} 
			
		}
		double average = (double)total / count;	
		println("");
		println("The average score of all is: " + average);
		
		String word = "";
		switch ((int) average){
			case 0: word= "don't pass, score 0 you have to study more"; break;
			case 1: word= "don't pass, 2"; break;
			case 2: word= "don't pass, 3"; break;
			case 3: word= "don't pass, 4"; break;
			case 4: word= "don't pass but very close, score 4"; break;
			case 5: word= "pass with 5"; break;
			case 6: word= "pass with 6"; break;
			case 7: word= "pass with 7"; break;
			case 8: word= "pass with 8"; break;
			case 9: word= "pass with 9"; break;
			case 10: word= "pass with the higest score 10"; break;
			default: break;
		
		
		}
		println("");
		println("The group average mean that you " + word);
	}
}