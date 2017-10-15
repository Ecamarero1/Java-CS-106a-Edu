/**
 * A program that draws stoplights on the screen.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Stoplight extends GraphicsProgram {
	/* The size of each of the three lights. */
	private static final double LIGHT_DIAMETER = 100;
	
	/* The size of the overall stoplight. */
	private static final double STOPLIGHT_WIDTH = LIGHT_DIAMETER;
	private static final double STOPLIGHT_HEIGHT = 3 * LIGHT_DIAMETER; 
	
	/* Draw two stoplights on the screen. */
	public void run() {
		drawStoplight(100, 100);
		drawStoplight(400, 100);
	}
	
	/**
	 * Draws a stoplight whose upper-left corner is given by the specified
	 * x and y coordinates.
	 * 
	 * @param x The X coordinate of the upper-left corner of the light.
	 * @param y The Y coordinate of the upper-left corner of the light.
	 */
	private void drawStoplight(double x, double y) {
		drawBox(x, y);
		drawLights(x, y);
	}
	
	/**
	 * Draws the gray box that makes the back of the stoplight.
	 * 
	 * @param x The X coordinate of the upper-left corner of the box.
	 * @param y The Y coordinate of the upper-left corner of the box.
	 */
	private void drawBox(double x, double y) {
		GRect box = new GRect(x, y, STOPLIGHT_WIDTH, STOPLIGHT_HEIGHT);
		box.setFilled(true);
		box.setColor(Color.GRAY);
		add(box);
	}
	
	/**
	 * Draws all three of the lights of the stoplight.
	 * 
	 * @param x The X coordinate of the upper-left corner of the stoplight.
	 * @param y The Y coordinate of the upper-left corner of the stoplight.
	 */
	private void drawLights(double x, double y) {
		drawSingleLight(x, y, Color.RED);
		drawSingleLight(x, y + LIGHT_DIAMETER, Color.YELLOW);
		drawSingleLight(x, y + 2 * LIGHT_DIAMETER, Color.GREEN);
	}
	
	/**
	 * Draws a single light at the indicated position using the specified color.
	 * 
	 * @param x The X coordinate of the upper-left corner of the light's bounding box.
	 * @param y The Y coordinate of the upper-left corner of the light's bounding box.
	 * @param color The color of the light.
	 */
	private void drawSingleLight(double x, double y, Color color) {
		GOval light = new GOval(x, y, LIGHT_DIAMETER, LIGHT_DIAMETER);
		light.setFilled(true);
		light.setColor(color);
		add(light);
	}
}
