/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

package Familia52;

import java.util.Scanner;

public class repeticao2 {

	public static void main(String[] args) {
		
		int num, x, quantPar = 0, quantImpar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 1; x <= 10; x++) {
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			if(num % 2 == 0) {
				quantPar++;
			} else {
				quantImpar++;
			}
		}
		
		System.out.printf("\nQuantidade de números pares: %d", quantPar);
		System.out.printf("\nQuantidade de números ímpares: %d", quantImpar);

	}

}
