package POO;

public class cliente {

	//declaração de atributos da classe Cliente:
	
	private String nomeCliente;
	private String CPF;
	private String telefone;
	private String email;
	private String endereco;
	
	
	
	public cliente(String nomeCliente, String cPF, String telefone, String email, String endereco) {
		super();
		this.nomeCliente = nomeCliente;
		CPF = cPF;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public String getCPF() {
		return CPF;
	}



	public void setCPF(String cPF) {
		CPF = cPF;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public void imprimirInfo() {
		System.out.println("\t\tDados do(a) cliente:\n");
		System.out.println("Nome:"+nomeCliente);
		System.out.println("CPF:"+CPF);
		System.out.println("Telefone:"+telefone);
		System.out.println("E-mail:"+email);
		System.out.println("Endereço de residência:"+endereco);
	}
	
}
