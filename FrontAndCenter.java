/* A program drawing a rectangle centered in the middle of the
 * window.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class FrontAndCenter extends GraphicsProgram {
	/* Constants controlling the size of the box. */
	private static final double BOX_WIDTH = 600;
	private static final double BOX_HEIGHT = 200;
	
	public void run() {
		/* Compute the coordinates of the upper-left corner of the
		 * box using the math sketched out in the slides.
		 */
		double x = (getWidth()  - BOX_WIDTH)  / 2.0;
		double y = (getHeight() - BOX_HEIGHT) / 2.0;
		
		/* Draw a filled box there. */
		GRect box = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		box.setFilled(true);
		box.setColor(Color.BLUE);
		add(box);
	}
}
