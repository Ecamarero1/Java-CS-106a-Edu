/* A program that draws a filled circle in the bottom-left corner of
 * the window.
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class FeelingCornered extends GraphicsProgram {
	/* The diameter of the circle to draw. */
	private static final double CIRCLE_DIAMETER = 100;
	
	public void run() {
		/* These are the coordinates of the upper-left corner
		 * of the cornered circle. They're formed by starting
		 * at the far sides and backing off by some number of pixels.
		 */
		double x = getWidth()  - CIRCLE_DIAMETER;
		double y = getHeight() - CIRCLE_DIAMETER;
		
		/* We then create a filled blue circle to
		 * place at that position.
		 */
		GOval circle = new GOval(x, y, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
		circle.setFilled(true);
		circle.setColor(Color.BLUE);
		add(circle);
	}
}
