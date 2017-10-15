/* HelloProgramObject.java
** Creamos figuras con objetos y
* etiquetas
**/

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class HelloProgramObject extends GraphicsProgram{
	
	public void run(){
	
		// Rectangulo
		GRect rectangulo = new GRect(250,180,100,150);
		rectangulo.setFilled(true);
		rectangulo.setColor(Color.BLUE);
		add (rectangulo);
		
		// Circulo
		GOval circulo = new GOval (240,90,130,100);
		circulo.setFilled(true);
		circulo.setColor(Color.GREEN);
		add (circulo);
		
		// Etiqueta
		GLabel etiqueta = new GLabel ("edu",50,50);
		etiqueta.setFont("SandSerif-BOLD-36");
		etiqueta.setColor(Color.MAGENTA);
		add (etiqueta);
		
		//Rectangolo pierna Izquierda
		GRect piernaIz = new GRect(250,300,10,150);
		piernaIz.setFilled(true);
		piernaIz.setColor(Color.RED);
		add(piernaIz);
		
//		Rectangolo pierna Izquierda
		GRect piernaDr = new GRect(340,300,10,150);
		piernaDr.setFilled(true);
		piernaDr.setColor(Color.RED);
		add(piernaDr);
		
	}
}