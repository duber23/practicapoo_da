package co.edu.poli.poo.secuenciales;

import java.util.Scanner;

/**
 * 
 * @author duber portocarrero
 *
 */
public class Inversion {
	//Objeto que permite capturar informacion a través del teclado
	static Scanner s;
	public static void main(String args[]) {
		//Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);
		
		//Entradas
		final int PORC_INTERES = 2;
		int capital;
		
		//Salidas
		int valorGanado;
		
		//Proceso
		System.out.println("Digite el valor del capital: ");
		capital = s.nextInt();
		
		valorGanado = capital * PORC_INTERES / 100;
		
		System.out.println("Valor Ganado: "+valorGanado);
		
		
	}
}
