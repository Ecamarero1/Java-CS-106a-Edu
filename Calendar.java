/*
*	Calendar.java
*
*	Draw a Chess board with Checkers
*
*/

import acm.program.*;
import acm.graphics.*;

public class Calendar extends GraphicsProgram {
	
	private static final int DAYS_IN_MONTH = 31;
	private static final int DAY_MONTH_STARTS = 5;
	private static final int DAY_WIDTH = 40;
	private static final int DAY_HEIGHT = 30;
	
	
	public void run (){

		//Calculate the number of rows that we need.
		double rows = ((DAY_MONTH_STARTS)+DAYS_IN_MONTH)/7;
		if ((rows/10) < DAY_MONTH_STARTS){
			rows +=1;
		}
		// Creates the structure of the calendar
		int day =1;	
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < 7; j++){
				int x = j * DAY_WIDTH;
				int y = i * DAY_HEIGHT;
				
				// Draw the calender squares
				GRect sq = new GRect (x, y, DAY_WIDTH, DAY_HEIGHT);
				add(sq);
				
				// Draw the number of the days
				GLabel date = new GLabel((""+day ), x + 5 , y + 12);
				if((i * 7 + j) >= DAY_MONTH_STARTS && day <= DAYS_IN_MONTH){
					add(date);
					day++;
				}
				
				
								
			}
		}
	}
}