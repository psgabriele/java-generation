/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package Familia52;

import java.util.Scanner;

public class repeticao5 {

	public static void main(String[] args) {
		
		int num, somaNum = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com um número do teclado: ");
			num = leia.nextInt();
			somaNum += num;
		} while(num != 0);
		
		System.out.printf("\nA soma dos números digitados é: %d", somaNum);
	}

}
