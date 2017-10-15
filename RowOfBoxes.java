/* A program that draws a single row of boxes on the screen. We used
 * this as a warm-up to the checkerboard problem.
 */
import acm.program.*;
import acm.graphics.*;

public class RowOfBoxes extends GraphicsProgram {
	/* Constant controlling the size of the boxes. */
	private static final double BOX_SIZE = 50;
	
	/* The total number of boxes to draw. */
	private static final int NUM_BOXES = 12;
	
	public void run() {
		for (int i = 0; i < NUM_BOXES; i++) {
			double x = i * BOX_SIZE;
			
			GRect box = new GRect(x, 0, BOX_SIZE, BOX_SIZE);
			add(box);
		}
	}
}
