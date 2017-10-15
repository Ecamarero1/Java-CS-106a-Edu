/* A program that illustrates the collage model by drawing objects
 * on top of one another. This program should definitely be cleaned
 * up to use constants instead of Magic Numbers.
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class BeautifulCollage extends GraphicsProgram {
	public void run() {
		/* Draw a filled orange rectangle. */
		GRect myRect = new GRect(100, 50, 300, 75);
		myRect.setFilled(true);
		myRect.setColor(Color.ORANGE);
		add(myRect);
		
		/* Draw an oval whose inside is one color and whose inside
		 * is another color.
		 */
		GOval myOval = new GOval(300, 75, 100, 75);
		myOval.setFilled(true);
		myOval.setColor(Color.RED);
		myOval.setFillColor(Color.GREEN);
		add(myOval);
	}
}
