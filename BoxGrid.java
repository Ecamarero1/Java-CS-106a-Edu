/* A program that draws a checkerboard in Java. The technique used here
 * works by looking at the parity (the oddness or evenness) of the sum
 * of the row and column indices of each square.
 */
import acm.graphics.*;
import acm.program.*;

public class BoxGrid extends GraphicsProgram {
	/* The number of rows and columns in the figure. */
	private static final int NUM_ROWS = 8;
	private static final int NUM_COLS = 8;
	
	/* The size of each box. */
	private static final double BOX_SIZE = 50;
	
	public void run() {
		/* Use a double for loop to iterate over all row, column pairs whose
		 * values are in range.
		 */
		for (int i = 0; i < NUM_ROWS; i++) {
			for (int j = 0; j < NUM_COLS; j++) {
				/* i contains the current row and j contains the current column.
				 * Map these to x/y coordinates.
				 */
				double x = j * BOX_SIZE;
				double y = i * BOX_SIZE;
				
				/* Create the square and, if the row plus the column is even,
				 * fill it.
				 */
				GRect box = new GRect(x, y, BOX_SIZE, BOX_SIZE);
				if ((i + j) % 2 == 0) {
					box.setFilled(true);
				}
				
				add(box);
			}
		}
	}
}
