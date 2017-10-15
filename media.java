/*
 * media.java
 * calcula el area de un triangulo
 * e imprime el resultado
 */

import acm.program.*;

public class media extends ConsoleProgram {
	
	public void run() {
		
		// Pide el la base del triangulo
		double b = readDouble("Enter base of the triangle: ");
		//Pide el la altura del triangulo
		double h = readDouble("Enter high of the triangle: ");
		//Calcula el area del triangulo
		double a = (b * h) / 2;
		println("Area of triangle = " + a);
	}
}