/* A simple program to illustrate accessing the loop counter in
 * a for loop.
 */
import acm.program.*;

public class CountingUpward extends ConsoleProgram {
	private static final int NUM_ITERATIONS = 10;
	
	public void run() {
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			println("The current value of i is " + i);
		}
	}
}
