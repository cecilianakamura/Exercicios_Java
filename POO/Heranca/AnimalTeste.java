package Heranca;

public class AnimalTeste {

	public static void main(String[] args) {
		Animal Cachorro1 = new Cachorro("Pingo",1,true,"Woof!",true);
		Animal Cavalo1 = new Cavalo("Epona",5,true,"Hii iin!",true);
		Animal BichoPreguica1 = new BichoPreguica("Speedy",10,true,"AAAAAA",true);
		
		Cachorro1.imprimirInfo();
		((Cachorro) Cachorro1).acao();
		Cavalo1.imprimirInfo();
		((Cavalo)Cavalo1).acao();
		BichoPreguica1.imprimirInfo();
		((BichoPreguica)BichoPreguica1).acao();
		
	}

}
