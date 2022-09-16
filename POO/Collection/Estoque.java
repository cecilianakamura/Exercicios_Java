package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	
	public static void main (String args[]) {
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		List <String> estoque = new ArrayList<String>();
		
		do {
		System.out.println("\t\tMenu de atividades:\n");
		System.out.println("1. Adicionar um produto ao estoque.");
		System.out.println("2. Remover um produto do estoque.");
		System.out.println("3. Atualizar um produto do estoque.");
		System.out.println("4. Apresentar o estoque.");
		System.out.println("0. Sair do Menu.");
		System.out.println("Digite a opção desejada:");
		op = ler.nextInt();
		System.out.println("-------------------------------------------");
		
		switch(op) {
		
		case 1:
			ler.nextLine();
			System.out.println("Digite o nome do produto a ser adicionado:");
			String produtoAdd = ler.nextLine();
			estoque.add(produtoAdd);
			break;
		
		case 2:
			ler.nextLine();
			System.out.println("Digite o nome do produto a ser removido:");
			String produtoRem = ler.nextLine();
			if(estoque.contains(produtoRem)) {
				estoque.remove(produtoRem);
			}else {
				System.out.println("Produto não existe no estoque para ser removido.");
			}
			
		case 3:
			ler.nextLine();
			System.out.println("Digite o nome do produto a ser atualizado");
			String produtoOld=ler.nextLine();
			System.out.println("Digite o nome do produto alterado:");
			String produtoNew=ler.nextLine();
			if(estoque.contains(produtoOld)) {
				estoque.remove(produtoOld);
				estoque.add(produtoNew);
			}else {
				System.out.println("Produto não existe no estoque para ser alterado.");
			}
		break;
		
		case 4:
			System.out.println("\n*****Estoque:*****");
			for(String lista:estoque) {
				System.out.println(lista);
			}
		break;
		
		case 0:
			System.out.println("Encerrando... \nObrigado por utilizar nosso sistema.");
		break;
		
		default:
			System.out.println("Opção inválida. Digite novamente.");
			op=ler.nextInt();
			break;
		}
		}while(op!=0);
		
	
	}
}
