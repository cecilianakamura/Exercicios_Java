package Heranca;

public class BichoPreguica extends Animal {

	private boolean sobe;

	public BichoPreguica(String nome, int idade, boolean emiteSom, String som, boolean sobe) {
		super(nome, idade, emiteSom, som);
		this.sobe = sobe;
	}

	public void acao() {
		if(sobe == true) {
			System.out.println("O animal deve subir em árvores.");
		}else {
			System.out.println("O animal não deve subir em árvores.");
		}
	}

	
}
