/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
  em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

package Familia52;

public class Aviao {

	private String tipo;
	private double cargaMaxima;
	private String compartimentoCarga;
	private String aberturaPorta;
	private double volumeCarga;
	
	public Aviao(String tipo, double cargaMaxima, String compartimentoCarga, String aberturaPorta, double volumeCarga) {
		this.tipo = tipo;
		this.cargaMaxima = cargaMaxima;
		this.compartimentoCarga = compartimentoCarga;
		this.aberturaPorta = aberturaPorta;
		this.volumeCarga = volumeCarga;
	}
	
	public void imprimirAviao() {
		System.out.println("\n\tInformações do avião");
		System.out.println("\nTipo de aeronave: " + tipo);
		System.out.println("\nCarga máxima: " + cargaMaxima + " kg");
		System.out.println("\nCompartimento de carga: " + compartimentoCarga);
		System.out.println("\nAbertura de porta: " + aberturaPorta);
		System.out.println("\nVolume de carga: " + volumeCarga + " m^3");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public String getCompartimentoCarga() {
		return compartimentoCarga;
	}

	public void setCompartimentoCarga(String compartimentoCarga) {
		this.compartimentoCarga = compartimentoCarga;
	}

	public String getAberturaPorta() {
		return aberturaPorta;
	}

	public void setAberturaPorta(String aberturaPorta) {
		this.aberturaPorta = aberturaPorta;
	}

	public double getVolumeCarga() {
		return volumeCarga;
	}

	public void setVolumeCarga(double volumeCarga) {
		this.volumeCarga = volumeCarga;
	}
	
}
