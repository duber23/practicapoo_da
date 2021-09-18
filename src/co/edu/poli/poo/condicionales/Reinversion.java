package co.edu.poli.poo.condicionales;

import java.util.Scanner;

/**Un hombre desea saber cuanto dinero se genera 
 * por concepto de intereses sobre la cantidad que 
 * tiene en inversión en el banco. Él decidirá reinvertir
 *  los intereses siempre y cuando estos excedan 
 *  a $50000, y en ese caso desea saber cuanto dinero
 *   tendrá finalmente en su cuenta.
 * @author duber portocarrero
 *
 */

public class Reinversion {
	static Scanner s;
	public static void main(String args[] ) {
		s = new Scanner(System.in);
		
		//Entradas
		final int LIMITE_INTERESES = 50000;
		int valorInvertir;
		float tasaInteres;
		//Salidas
		float gananciaTotal;
		
		//Entradas
		float valorIntereses;
		System.out.println("Digite valor a invertir: ");
		valorInvertir = s.nextInt();
		System.out.println("Digite tasa de interés: ");
		tasaInteres = s.nextFloat();
		
		valorIntereses = valorInvertir * tasaInteres / 100;
		
		if(valorIntereses > LIMITE_INTERESES) {
			gananciaTotal = valorInvertir + valorIntereses + 
					(valorInvertir + valorIntereses)*tasaInteres/100;
		}else {
			gananciaTotal = valorInvertir +valorIntereses;
		}
		
		System.out.println("Valor de ganancia total: "+gananciaTotal);
	}
}
