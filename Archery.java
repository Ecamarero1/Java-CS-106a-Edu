/*
*	GOval_Archery.java - 16/09/17
*
*	This program creates a Archery Target
*	With 3 circles, in the middle of the canvas
*/

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class Archery extends GraphicsProgram  {
	
	private static final double OVAL1 = 21.6; // equals 0.3 inches
	private static final double OVAL2 = 46.8; // equals 0.65 inches
	private static final double OVAL3 = 72.0; // equals 1 inch
		
	
	public void run() {
		
		//Calculate the middle width and height of the canvas
		double middleWidth = getWidth()/2;
		double middleHeight = getHeight()/2;
		
		/*	Creates the big circle just in the middle of the canvas
		*	The big circle is filed in red color
		*	The size of this circle has a radio of 1 inch (72.0 pixels)
		*/
		
		GOval myOval3 = new GOval (middleWidth-OVAL3, middleHeight-OVAL3, OVAL3*2, OVAL3*2);
		myOval3.setFilled(true);
		myOval3.setColor(Color.RED);
		add(myOval3);
		
		/*	Creates the middle circle just in the middle of the canvas
		*	The middle circle is filed in white color
		*	The size of this circle has a radio of 0.65 inches (46.8 pixels)
		*/
		
		GOval myOval2 = new GOval(middleWidth-OVAL2, middleHeight-OVAL2, OVAL2*2, OVAL2*2);
		myOval2.setFilled(true);
		myOval2.setColor(Color.WHITE);
		add(myOval2);
		
		/*	Creates the small circle just in the middle of the canvas
		*	The small circle is filed in white color
		*	The size of this circle has a radio of 0.3 inches (21.6 pixels)
		*/
		
		GOval myOval1 = new GOval(middleWidth-OVAL1, middleHeight-OVAL1, OVAL1*2, OVAL1*2);
		myOval1.setFilled(true);
		myOval1.setColor(Color.RED);
		myOval1.setFillColor(Color.RED);
		add(myOval1);
		
		
		
		
		
		}
		
}

	

