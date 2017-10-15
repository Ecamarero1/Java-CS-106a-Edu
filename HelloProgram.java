/* A graphical "Hello World!" program that shows off the basics
 * of drawing graphics on the screen.
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class HelloProgram extends GraphicsProgram {
	public void run() {
		GLabel label = new GLabel("I love Java!", 300, 150);
		label.setFont("SansSerif-BOLD-36");
		label.setColor(Color.MAGENTA);
		add(label);
		GLabel sing = new GLabel("Eduardo Camarero", 400,400);
		sing.setColor(Color.GRAY);
		sing.setFont("Arial-BOLD-15");
		add(sing);
	}
}
