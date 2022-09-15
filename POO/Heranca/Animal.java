package Heranca;

public class Animal {
//Criando atributos
	
	private String nome;
	private int idade;
	private boolean emiteSom;
	private String som;

//Construtor
	public Animal(String nome, int idade, boolean emiteSom, String som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
		this.som = som;
	}

//Métodos
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public void imprimirInfo() {
		System.out.println("-------Dados do animal-------");
		System.out.println("\nNome: "+this.nome+"\nIdade: "+this.idade);
	
		if (this.emiteSom==true) {
			System.out.println("O animal emite o som: "+this.som);
		}else {
			System.out.println("O animal não emite som.");
		}

	}
	
}
