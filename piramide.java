/*
* piramide.java
* 
* Dibuja una piramide de altura fijada en
* la constante BRICKS_IN_BASE
*
*/

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class piramide extends GraphicsProgram{
	
	// Constantes que determinan el tamaño de cada bloque
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	
	// Constante que determina la altura de la piramide
	private static final int BRICKS_IN_BASE = 14;
	
	public void run(){
		
		//	Calculamos en fondo de la pantalla para empezar alli nuestra piramide
		int botton = getHeight();
		
		// Calculamos el medio de la pantalla 
		int middle = (getWidth() /2);
				
		// Pintamos la piramide
		for (int i=0; i < BRICKS_IN_BASE; i++){
			
			for (int j=0; j< BRICKS_IN_BASE-i; j++){
				
				int x = i * BRICK_WIDTH;
				int y = j * BRICK_HEIGHT;
				
				// La mitad de la base de la piramide esta en el medio de la pantalla
				double start = middle - (BRICK_WIDTH *(BRICKS_IN_BASE/2)-(j*(BRICK_WIDTH/2)));				
				// Dibujamos la fila correspondiente
				GRect caja = new GRect(x+start, botton-BRICK_HEIGHT-y, BRICK_WIDTH, BRICK_HEIGHT);
				//Pintamos los ladrillos pares de la piramide
				caja.setFilled(((i + j) % 2) != 0);
				caja.setColor(Color.DARK_GRAY);
				add(caja);
				
					
				
									
				
			}
		}
	}
	
	
}

