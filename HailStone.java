/*
*	HailStone.java
*	
*	Creates a program that ask you for a positive
*/


import acm.program.*;

public class HailStone extends ConsoleProgram {
	
	public void run(){
		
		int n;
		while (true ){
			println("Enter a positive integer: ");
			n = readInt();
			if (n == 1){
				println("The process takes 0 to reach 1");
			}
			if (n <= 0) {
				println("Error you enter a non positive number");
				break;
			}
			int count=0;
			while (n != 1){
				if (n % 2 ==0) {
					int i = n;
					n /= 2;					
					println(i + " is even, so I take half: " + n);
				}
				else if (n % 2 != 0){
					int i = n;
					n = n *3 +1;					
					println(i + " is odd, so I make n*3 +1; " + n);
				} 
				if (n == 1 ){
					println("The process takes " + count + " to reach 1");		
				}
			count++;
			}
			break;
		}	
	} 
}