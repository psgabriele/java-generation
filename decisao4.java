/*4.Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
Se for par exiba também a raiz quadrada dele; se for ímpar exiba o número elevado ao quadrado.
*/

package Familia52;

import java.util.Scanner;

public class decisao4 {

	public static void main(String[] args) {
		
		double num, rNum, qNum;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nEntre com um número: ");
			num = leia.nextDouble();
		}
		
		if(num % 2 == 0) {
			System.out.println("\nNúmero par");
			rNum = Math.sqrt(num);
			System.out.println("A raiz de " + num + " é igual a " + rNum);
		} else {
			System.out.println("\nNúmero ímpar");
			qNum = Math.pow(num, 2);
			System.out.println("O quadrado de " + num + " é igual a " + qNum);
		}

	}

}
