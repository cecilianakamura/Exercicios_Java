package Heranca;

public class AnimalTeste {

	public static void main(String[] args) {
		Animal [] animais = {new Cachorro(), new Cavalo(), new BichoPreguica()};
		
		for(Animal animal:animais) {
			animal.emitirSom();
		}

	}

}
