package Heranca;

public class Cachorro extends Animal {

	@Override
	public void acao() {
		System.out.println("O cachorro corre.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro emite o som: Woof!");
		
	}

}
