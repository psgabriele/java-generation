/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package Familia52;

import java.util.Scanner;

public class repeticao6 {

	public static void main(String[] args) {
		
		int num, somaM3 = 0, quantM3 = 0;
		float mediaM3 = 0;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			
			do {
				
				if(num % 3 == 0) {
					somaM3 += num;
					quantM3++;
					mediaM3 = somaM3 / quantM3;
				}
				
				System.out.println("\nEntre com um número: ");
				num = leia.nextInt();
				
			} while(num != 0);
		}
		
		System.out.println("\nA média dos números múltiplos de 3 é: " + mediaM3);
	}

}
