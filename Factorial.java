/*
* Factorial.java
* 
* Calcula los nº factoriales de todos los nº fijados como constante
*
*/

import acm.program.*;

public class Factorial extends ConsoleProgram {
	
	private static final int MAX_NUM = 11;
	
	public void run() {
		for (int i = 0; i < MAX_NUM; i++){
			println(i + "!= " + factorial(i));
		}
	}
	private int factorial(int n){
		int result = 1;
		for (int i=1; i<= n; i++) {
			result *= i;
		}
		return result;
	}
}