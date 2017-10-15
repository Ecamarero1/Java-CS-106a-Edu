/* A simple program illustrating a double for loop. */
import acm.program.*;

public class DoubleForLoop extends ConsoleProgram {
	public void run() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				println(i + ", " + j);
			}
		}
	}
}
