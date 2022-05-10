/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

package Familia52;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int contMaior10 = 0, l, i;
		
		Scanner leia = new Scanner(System.in);
		
		for(l = 0; l < 3; l++) {
			for(i = 0; i < 3; i++) {
				System.out.println("\nEntre com um número: ");
				matriz[l][i] = leia.nextInt();
			}
		}
		for(l = 0; l < 3; l++) {
			for(i = 0; i < 3; i++) {
				if(matriz[l][i] > 10) {
					contMaior10++;
				}
			}
		}
		
		System.out.println("\nA matriz possui " + contMaior10 + " valores maiores que 10.");
	}

}
