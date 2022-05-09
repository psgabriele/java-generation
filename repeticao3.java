/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package Familia52;

import java.util.Scanner;

public class repeticao3 {

	public static void main(String[] args) {
		
		int idade, totalMenos21 = 0, totalMais50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPara finalizar o programa digite '-99'.");
		System.out.println("\nEntre com a idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			if(idade < 21) {
				totalMenos21++;
			} else if(idade > 50) {
				totalMais50++;
			}
			System.out.println("\nEntre com a idade: ");
			idade = leia.nextInt();
		}
		
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", totalMenos21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", totalMais50);
	}

}
