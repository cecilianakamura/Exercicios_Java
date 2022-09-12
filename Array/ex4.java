package Array;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	
	float [][] M1 = new float[2][2];
	float [][] M2 = new float [2][2];
	float [][] M3 = new float [2][2];
	int linha, coluna,opcao;
	float constante;
	
	Scanner leia = new Scanner(System.in);
	
	for(linha=0;linha<2;linha++) {
		for(coluna=0;coluna<2;coluna++) {
			System.out.printf("Digite o elemento M1[%d][%d]: ",linha+1,coluna+1);
			M1[linha][coluna] = leia.nextFloat();
		}
	}
	for(linha=0;linha<2;linha++) {
		for(coluna=0;coluna<2;coluna++) {
			System.out.printf("Digite o elemento M2[%d][%d]: ",linha+1,coluna+1);
			M2[linha][coluna] = leia.nextFloat();
		}
	}
	
	System.out.println("Menu de opções:");
	System.out.println("1)Somar as duas matrizes;");
	System.out.println("2)Subtrair a primeira matriz da segunda;");
	System.out.println("3)Adicionar uma constante às duas matrizes;");
	System.out.println("4)Imprimir as matrizes.");
	System.out.println("Digite uma opção:");
	opcao = leia.nextInt();
	switch (opcao) {
	
	case 1:
		System.out.println("Resultado da adição da matriz M1 à matriz M2 (M1+M2):");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				M3[linha][coluna]=M1[linha][coluna] + M2[linha][coluna];
				System.out.print(M3[linha][coluna]+"\t");
			}
		System.out.println();
		}
		break;
	case 2:
		System.out.println("Resultado da subtração da matriz M1 da matriz M2 (M2-M1):");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				M3[linha][coluna]=M2[linha][coluna] - M1[linha][coluna];
				System.out.print(M3[linha][coluna]+"\t");
			}
			System.out.println();
		}
		break;
		
	case 3:
		System.out.println("Insira um valor para a constante: ");
		constante = leia.nextFloat();
		
		System.out.println("Resultado da constante adicionada à matriz M1:");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				M1[linha][coluna] = M1[linha][coluna] + constante;
				System.out.print(M1[linha][coluna]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Resultado da constante adicionada à matriz M2:");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				M2[linha][coluna] = M2[linha][coluna] + constante;
				System.out.print(M2[linha][coluna]+"\t");
			}
			System.out.println();

		}
		
		break;
	case 4:
		System.out.println("Matriz M1:");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.print(M1[linha][coluna]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Matriz M2:");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.print(M2[linha][coluna]+"\t");
			}
			System.out.print("\n");
		}
		break;
		default:
			System.out.println("Opção inválida!");
			
	}
	}

}
