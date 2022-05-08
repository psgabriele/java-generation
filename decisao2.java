//2.Faça um programa que entre com três números e coloque em ordem crescente.

package Familia52;

import java.util.Scanner;

public class decisao2 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo valor: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro valor: ");
		n3 = leia.nextInt();
		
		if(n3 >= n1) {
			if(n1 >= n2) {
				System.out.printf("\nOrdem crescente: " + n2 + ", " + n1 + ", " + n3 + ".");
			} else {
				if(n2 <= n3) {
					System.out.printf("\nOrdem crescente: " + n1 + ", " + n2 + ", " + n3 + ".");
				}
			}
		}
		
		if(n1 > n2) {
			if(n2 > n3) {
				System.out.printf("\nOrdem crescente: " + n3 + ", " + n2 + ", " + n1 + ".");
			} else {
				if(n3 < n1) {
					System.out.printf("\nOrdem crescente: " + n2 + ", " + n3 + ", " + n1 + ".");
				}
			}
		}
		
		if(n1 < n2) {
			if(n3 < n1) {
				System.out.printf("\nOrdem crescente: " + n3 + ", " + n1 + ", " + n2 + ".");
			} else {
				if(n3 < n2) {
					System.out.printf("\nOrdem crescente: " + n1 + ", " + n3 + ", " + n2 + ".");
				}
			}
		}
		
		

	}

}
