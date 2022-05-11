/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
 em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

package Familia52;

public class Cliente {

	private String nomeCliente;
	private String dataNascimento;
	private String cpf;
	private String email;
	private String telefone;
	
	public Cliente(String nomeCliente, String dataNascimento, String cpf, String email, String telefone) {
		this.nomeCliente = nomeCliente;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void imprimirCliente() {
		System.out.println("\n\tInformações do cliente");
		System.out.println("\nNome: " + nomeCliente);
		System.out.println("\nData de nascimento: " + dataNascimento);
		System.out.println("\nCPF: " + cpf);
		System.out.println("\nEmail: " + email);
		System.out.println("\nTelefone: " + telefone);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
