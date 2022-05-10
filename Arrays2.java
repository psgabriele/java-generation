/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/

package Familia52;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		
		int[] num = new int[6];
		int x, somaPar = 0, quantImpar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 0; x < 6; x++) {
			System.out.println("\nEntre com um número: ");
			num[x] = leia.nextInt();
			
			if(num[x] % 2 == 0) {
				somaPar += num[x];
			} else {
				quantImpar++;
			}
		}
		
		for(x = 0; x < 6; x++) {
			if(num[x] % 2 == 0) {
				System.out.println("\n\tNúmero par: ");
				System.out.println("\nValor = " + num[x]);
			} else {
				System.out.println("\n\tNúmero ímpar: ");
				System.out.println("\nValor = " + num[x]);
			}
		}
		
		System.out.println("\nSoma dos números pares: " + somaPar);
		System.out.println("\nQuantidade de números ímpares: " + quantImpar);
		
	}

}
