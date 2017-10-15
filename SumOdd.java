/*
*	SumOdd.java
*	Read a integer N form the user and sum the N firts
*	odd numbers
*/

import acm.program.*;

public class SumOdd extends ConsoleProgram {
	
	public void run (){
		int n;
		while(true){
			print("Enter a positive integer for number of odd numbers to add: ");
			n = readInt();
			if (n <= 0); break;
		}
		int sumodd = 0;
		int odd = 1;
		for (int i = 1; i<= n; i++){
			println(i + " odd number: " + odd);
			sumodd += odd;
			odd +=2;
			
		
		
		}
		println("The sum of all the odd number: " + sumodd);
	}
}