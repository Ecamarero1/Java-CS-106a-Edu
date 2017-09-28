/*
*	diagram.java
*	draw a diagram with 4 boxes with the same size
*	all of them are linked by lines in the middle of
*	each box. All the boxes have the same size, and the hole
*	figure is located in the middle of the canvas
*
*/

import acm.graphics.*;
import acm.program.*;

public class diagram extends GraphicsProgram {
	
	public static final int WIDTH = 160;
	public static final int HEIGHT = 50;
	
	public void run() {
		
		// First we have to calculate the middle of the canvas
		double middleWidth = getWidth()/2;
		double middleHeight = getHeight()/2;
		
	
		
		// creates the first box just in the middle of the canvas, is the center box.
		GRect firtsBox = new GRect(middleWidth-(WIDTH/2), middleHeight-(HEIGHT/2) , WIDTH, HEIGHT);
		add(firtsBox);
		
		//creates the fist label just in the middle of the box,
		
		GLabel middleLabel = new GLabel ("ConsoleProgram");
		double x = middleLabel.getWidth()/2;
		double y = middleLabel.getAscent()/2;
		GLabel firstLabel = new GLabel ("ConsoleProgram", middleWidth-x ,middleHeight+y);
		add(firstLabel);	
		
		// Creates the left box with the same size, but with a 1.5*WIDTH of distance from center Box.
		GRect secondBox = new GRect(middleWidth-(WIDTH*2), middleHeight-(HEIGHT/2), WIDTH, HEIGHT);
		add(secondBox);
		
		//creates the second label just in the left box,
		GLabel leftLabel = new GLabel ("GraphicsProgram",1 ,1);
		double i = leftLabel.getWidth()/2;
		double j = leftLabel.getAscent()/2;
		GLabel secondLabel = new GLabel ("GraphicsProgram", middleWidth-(WIDTH*1.5)-i ,middleHeight+j);
		add(secondLabel);
		
		//Creates the right Box with the same size, but 1.5*WIDTH of distance from center box.
		GRect trirdBox = new GRect(middleWidth+(WIDTH), middleHeight-(HEIGHT/2), WIDTH, HEIGHT);
		add(trirdBox);
		
		//creates the trird label just in the right box,
		GLabel rightLabel = new GLabel ("GraphicsProgram",1 ,1);
		double k = rightLabel.getWidth()/2;
		double l = rightLabel.getAscent()/2;
		GLabel trirdLabel = new GLabel ("DialogProgram", middleWidth+(WIDTH*1.5)-k ,middleHeight+l);
		add(trirdLabel);
		
		//Creates the upper box with the same size, but 1.5HEIGHT of distance from center box.
		GRect upperBox = new GRect(middleWidth-(WIDTH/2), middleHeight-(HEIGHT*2.5), WIDTH, HEIGHT);
		add(upperBox);
		
		//creates the fourth label just in the upper box,
		GLabel upperLabel = new GLabel ("GraphicsProgram",1 ,1);
		double m = upperLabel.getWidth()/2;
		double n = upperLabel.getAscent()/2;
		GLabel fourthLabel = new GLabel ("Program", middleWidth-m/2 ,middleHeight-(HEIGHT*2)+n);
		add(fourthLabel);
		
		//createsLines to connect the boxes, create the middle Line.
		GLine middleLine = new GLine(middleWidth, middleHeight-(HEIGHT/2), middleWidth, middleHeight-HEIGHT*1.5);
		add(middleLine);
		
		//create the the left line
		GLine leftLine = new GLine(middleWidth, middleHeight-HEIGHT*1.5, middleWidth-(WIDTH*1.5), middleHeight-(HEIGHT/2));
		add(leftLine);
		
		//Create the right Line
		GLine rightLine = new GLine(middleWidth, middleHeight-HEIGHT*1.5, middleWidth+(WIDTH*1.5), middleHeight-(HEIGHT/2));
		add(rightLine);
	}
	
}