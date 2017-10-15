import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SeeingStars extends GraphicsProgram {
	/* Constants controlling the location of the star. */
	private static final double STAR_CENTER_X = 200;
	private static final double STAR_CENTER_Y = 200;
	
	/* Constants controlling the location of the star. */
	private static final double SECOND_STAR_CENTER_X = STAR_CENTER_X + 300;
	private static final double SECOND_STAR_CENTER_Y = STAR_CENTER_Y;
	
	/* Constant controlling the radius of the star. */
	private static final double STAR_RADIUS = 100;
	
	/* Constant controlling how many points the star has. */
	private static final int NUM_STAR_POINTS = 7;
	
	/* Draws a star centered at the given coordinates, using the provided
	 * radius, and drawn with the chosen color.
	 */
	private void drawStar(double x, double y, double radius,
			              Color starColor) {
		for (int i = 0; i < NUM_STAR_POINTS; i++) {
			/* Compute the angles of the current point and the next point. */
			double theta     =  i      * 2 * Math.PI / NUM_STAR_POINTS;
			double nextTheta = (i + 2) * 2 * Math.PI / NUM_STAR_POINTS;
			
			/* Construct a line between those points. */
			GLine line = new GLine(x + radius * Math.cos(theta),
					               y - radius * Math.sin(theta),
					               x + radius * Math.cos(nextTheta),
					               y - radius * Math.sin(nextTheta));
			
			/* Update the line color. */
			line.setColor(starColor);
			
			/* Display the line. */
			add(line);
		}
	}
	
	public void run() {
		for (int i = 0; i < 40; i++) {
			drawStar(getWidth() / 2.0, getHeight() / 2.0,
					 10 * i, Color.BLUE);
		}
	}
}
