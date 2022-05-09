/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

package Familia52;

public class repeticao1 {

	public static void main(String[] args) {
		
		int x;
		
		System.out.println("\n\tNúmeros de 1000 a 1999 divididos por 11, com resto 5: ");
		
		for(x = 1000; x <= 1999; x++) {
			if(x % 11 == 5) {
				System.out.printf("\n %d", x);
			}
		}
		
	}

}
