/*
*	ChessChecker.java
*
*	Draw a Chess board with Checkers
*
*/

import acm.program.*;
import acm.graphics.*;

public class ChessChecker extends GraphicsProgram {
	
	private static final int NROWS = 8;
	private static final int NCOLUMNS = 8;
	private static final int SQSIZE = 50;
	
	public void run (){
		
		for (int i = 0; i < NROWS; i++) {
			for (int j = 0; j < NCOLUMNS; j++){
				int x = j * SQSIZE;
				int y = i * SQSIZE;
								
				GRect sq = new GRect (x, y, SQSIZE, SQSIZE);
				GOval ov = new GOval ( x+5 , y+5, SQSIZE-10, SQSIZE-10 );
				add(sq);
				if (((i + j) % 2) == 0){
					add(ov);
				}				
			}
		}
	}
}