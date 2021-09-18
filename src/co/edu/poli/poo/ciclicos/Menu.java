
package co.edu.poli.poo.ciclicos;

import java.util.Scanner;

public class Menu {
	static Scanner s;
	public static void main(String args[]) {
		s = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion != 4) {
			System.out.println("Seleccione una opcion: ");
			System.out.println("1. Registrar contacto");
			System.out.println("2. Modificar contacto");
			System.out.println("3. Ver contacto");
			System.out.println("4. Salir");
			
			opcion = s.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Ingreso a la opcion de Registro");
				break;
			case 2:
				System.out.println("Ingreso a la opcion de Modificacion");
				break;
			case 3:
				System.out.println("Ingreso a la opcion de Visualizacion");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
			
		}
	}
}
