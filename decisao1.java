//1.Faça um programa que receba três inteiros e diga qual deles é o maior.

package Familia52;

import java.util.Scanner;

public class decisao1 {

	public static void main(String[] args) {
		
		int n1, n2, n3, maior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo valor: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro valor: ");
		n3 = leia.nextInt();
		
		if(n1 > n2) {
			if(n1 > n3)
				maior = n1;
			else
				maior = n3;
		} else {
			if(n2 > n3)
				maior = n2;
			else
				maior = n3;
		}
		
		System.out.printf("\nO maior número é: " + maior);
		

	}

}
