package Heranca;

public class Cachorro extends Animal{

	private boolean corre;

	public Cachorro(String nome, int idade, boolean emiteSom, String som, boolean corre) {
		super(nome, idade, emiteSom, som);
		this.corre = corre;
	}

	public void acao() {
		if (corre == true) {
			System.out.println("O animal deve correr.");
		}else {
			System.out.println("O animal não deve correr.");
		}
			
	}

	
}

