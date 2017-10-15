/* A program that draws a series of increasingly larger stars on the
 * canvas. The math here is detailed in the lecture slides.
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SeeingStars extends GraphicsProgram {
	/* Constant controlling the radius of the star. */
	private static final double STAR_RADIUS = 100;
	
	/* Constant controlling how many points the star has. */
	private static final int NUM_STAR_POINTS = 7;
	
	/**
	 * Draws a star with the specified center, radius, and color.
	 *
	 * @param x The x coordinate of the center of the star.
	 * @param y The y coordinate of the center of the star.
	 * @param radius The radius of the star.
	 * @param starColor The color of the star.
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
		/* Draw a series of progressively larger stars centered in the
		 * middle of the window.
		 */
		for (int i = 0; i < 40; i++) {
			drawStar(getWidth() / 2.0, getHeight() / 2.0, 10 * i, Color.BLUE);
		}
	}
}
