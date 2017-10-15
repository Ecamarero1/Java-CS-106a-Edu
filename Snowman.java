/**
 * A program that draws a snowman on the screen.
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Snowman extends GraphicsProgram {
	/* The sizes of the three snowman pieces. */
	private static final double TOP_DIAMETER = 100;
	private static final double MIDDLE_DIAMETER = 125;
	private static final double BOTTOM_DIAMETER = 200;
	
	/**
	 * Adds one piece of the snowman to the display. The added piece will
	 * be centered horizontally, will have the specified diameter, and
	 * will have its top determined by the Y coordinate parameter.
	 * 
	 * @param diameter The diameter of the piece.
	 * @param yCoord The Y coordinate of the top of the circle.
	 */
	private void addSnowmanPart(double diameter, double yCoord) {
		/* Center the piece horizontally on the screen. */
		GOval part = new GOval((getWidth() - diameter) / 2.0,
								yCoord,
                				diameter, diameter);
		part.setFilled(true);
		part.setColor(Color.WHITE);
		add(part);
	}

	public void run() {
		/* For effect, make the background gray. */
		setBackground(Color.GRAY);
	
		/* Position all three pieces of the snowman. */
		double bottomY = getHeight() - BOTTOM_DIAMETER;
		addSnowmanPart(BOTTOM_DIAMETER, bottomY);
		
		double middleY = bottomY - MIDDLE_DIAMETER;
		addSnowmanPart(MIDDLE_DIAMETER, middleY);
		
		double topY = middleY - TOP_DIAMETER;
		addSnowmanPart(TOP_DIAMETER, topY);
	}
}
