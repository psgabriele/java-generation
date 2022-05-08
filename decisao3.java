/*3.Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/

package Familia52;

import java.util.Scanner;

public class decisao3 {

	public static void main(String[] args) {
		
		int idade;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
		}
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("\nCategoria infantil");
		} else if(idade >= 15 && idade <= 17) {
			System.out.println("\nCategoria juvenil");
		} else if(idade >= 18 && idade <= 25) {
			System.out.println("\nCategoria adulto");
		} else {
			System.out.println("\nSem categoria");
		}

	}

}
