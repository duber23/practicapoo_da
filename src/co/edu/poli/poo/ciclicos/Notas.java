package co.edu.poli.poo.ciclicos;

import java.util.Scanner;

/**Calcular la nota definitiva de un estudiante
 * , teniendo en cuenta que la nota final es el
 *  promedio de las tres notas del curso
 * @author duber portocarrero
 *
 */


public class Notas {
	static Scanner duber;
	public static void main(String args[]) {
		duber = new Scanner(System.in);
		
		//Entradas
		final int NUMERO_NOTAS = 3;
		float nota;
		//Salidas
		float notaDefinitiva = 0;
		//Proceso
		for(int i=1; i<=NUMERO_NOTAS; i++) {
			System.out.println("Digite nota del corte "+i);
			nota = duber.nextFloat();
			notaDefinitiva += nota;
			
		}	
		notaDefinitiva = notaDefinitiva / NUMERO_NOTAS;
		System.out.printf("La nota definitiva es: %.2f",notaDefinitiva);
	}
}
