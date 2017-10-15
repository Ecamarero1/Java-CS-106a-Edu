/*
* prueba.java 
* 
* Calcula los impuestos y propina 
* sobre el importe de la cuenta que 
* indica el usuario
*
*/

import acm.program.*;

public class prueba extends ConsoleProgram {

	private static final double IMPUESTOS = 0.08; // The constant add the 8% on the bill
	private static final double PROPINA = 0.2; // The constant add the 20% on the bill
		
		public void run(){
			
			double cuenta = readDouble("Cual es el importe de la cuenta?: ");
			double impuestos = IMPUESTOS * cuenta;
			double propina = PROPINA * cuenta;
			double total = cuenta + impuestos + propina;
			
			println("El importe de los impuestos es: "+ impuestos + "€");
			println("El importe de la propina es: "+ propina+ "€" );
			println("El importe total de la cuenta es: " + total + "€");
		}
}