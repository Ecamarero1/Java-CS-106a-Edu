/*
*	MinMax.java
*	
*	Ask for several integer until the user introduce a
*	sentinel value 0. Then the program show the smaller and
*	the largest value that user has introduced.
*	
*/

import acm.program.*;

public class MinMax extends ConsoleProgram  {
	
	private static final int SENTINEL = 0;
	
	public void run (){
		
		println("Enter integers: ");
		println("When you want to stop, intoduce '0' and the program will return the minimun and maximun value you have introduce");
		
		int min = 0;
		int max = 0;
		int count = 0;
		
		while(true) {
			int userImput = readInt("?");
			count++;
			
			if (userImput == SENTINEL ){
				println("Error you introduce the SENTINEL '0' value and the program stop, no min o max value exist");
				break;
			} else if (count ==2){
				
				println("The min value is: " + userImput );
				println("The max value is: " + userImput );
			}
		if (count >=3 & userImput > max){
				max = userImput;
			} else if ( count >= 3 & min < userImput){
				min = userImput;
			}
			
				
		}
				
		println("The min value is: " +min );
		println("The max value is: " +max );	
			
			
		}
		
	}
