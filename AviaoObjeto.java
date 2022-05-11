package Familia52;

public class AviaoObjeto {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao("Piper PA-31", 599.65, "269cm X 102cm X 107cm", "65cm X 104cm", 3.002);
		Aviao aviao2 = new Aviao("Metro II", 1199.77, "836cm X 109cm X 104cm", "135cm X 130cm", 11.979);
		Aviao aviao3 = new Aviao("Beechcraft King Air", 1339.48, "368cm X 127cm X 119cm", "160cm X 109cm", 4.503);
		
		aviao1.imprimirAviao();
		aviao2.imprimirAviao();
		aviao3.imprimirAviao();
		
	}

}
