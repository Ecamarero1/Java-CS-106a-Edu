/*
*	SmallLarge.java
*	
*	Ask for several integer until the user introduce a
*	sentinel value 0. Then the program show the smaller and
*	the largest value that user has introduced.
*	
*/

import acm.program.*;

public class SmallLarge extends ConsoleProgram {

    /* Specifies the value of the sentinel */
    private static final int SENTINEL = 0;

    public void run() {
        println("This program finds the largest and smallest numbers entered.");
        println("Enter values, one per line, using " + SENTINEL + " to signal the end of the list.");
        int min = 0;
        int max = 0;
        int count = 0;
        while (true) {
            int value = readInt(" ? ");
            if (value == SENTINEL) break;
            count++;
            if (count == 1){
                min = value;
                max = value;
            }
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        if (count>0){
            println("Smallest: " + min);
            println("Largest: " + max);
        } else {
            println("No values were entered.");
        }
    }
}
