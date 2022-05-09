/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

package Familia52;

import java.util.Scanner;

public class repeticao4 {

	public static void main(String[] args) {
		
		int pesCalmas = 0, mNervosas = 0, hAgressivos = 0, pessoas = 1, oCalmos = 0, nerMais40 = 0, calMenos18 = 0;
		int idade, sexo, op;
		
		Scanner leia = new Scanner(System.in);
		
		while(pessoas <= 150) {
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			while(idade < 1 || idade > 130) {
				System.out.println("\nIdade inválida. \nEntre com a sua idade: ");
				idade = leia.nextInt();
			}
			
			System.out.println("\nEntre com o seu gênero: \n1-Feminino\n2-Masculino\n3-Não binário");
			sexo = leia.nextInt();
			while(sexo < 1 || sexo > 3) {
				System.out.println("\nGênero inválido. \nEntre com o seu gênero: \n1-Feminino\n2-Masculino\n3-Não binário");
				sexo = leia.nextInt();
			}
			
			System.out.println("\nEntre com o seu temperamento: \n1-Pessoa calma\n2-Pessoa nervosa\n3-Pessoa agressiva");
			op = leia.nextInt();
			while(op < 1 || op > 3) {
				System.out.println("\nTemperamento inválido. \nEntre com o seu temperamento: \n1-Pessoa calma\n2-Pessoa nervosa\n3-Pessoa agressiva");
				op = leia.nextInt();
			}
			
			if(op == 1) {
				pesCalmas++;
			}
			if(sexo == 1 && op == 2) {
				mNervosas++;
			}
			if(sexo == 2 && op == 3) {
				hAgressivos++;
			}
			if(sexo == 3 && op == 1) {
				oCalmos++;
			}
			if(op == 2 && idade > 40) {
				nerMais40++;
			}
			if(op == 1 && idade < 18) {
				calMenos18++;
			}
			
			pessoas++;	
		}
		
		System.out.println("\nQuantidade de pessoas calmas: " + pesCalmas);
		System.out.println("\nQuantidade de mulheres nervosas: " + mNervosas);
		System.out.println("\nQuantidade de homens agressivos: " + hAgressivos);
		System.out.println("\nQuantidade de não binários calmos: " + oCalmos);
		System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos: " + nerMais40);
		System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos: " + calMenos18);
	}

}
