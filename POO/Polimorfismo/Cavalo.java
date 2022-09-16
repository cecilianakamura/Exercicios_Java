package Heranca;

public class Cavalo extends Animal {

	@Override
	public void acao() {
		System.out.println("O cavalo deve correr.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O cavalo emite o som: Hii iaa!");
		
	}

}
