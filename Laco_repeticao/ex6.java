package Lacos_repeticao;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).
*/
	
		final int multiplo=3;
		int n,media,somaN=0,cont=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro:");
		n = leia.nextInt();
		
		do {
			if(n==0) {
				System.out.println("\nSair do loop.");
			}
			
			if(n%multiplo==0) {
				somaN+=n;
				cont++;
			}
			
		System.out.println("Digite um número inteiro:");
		n = leia.nextInt();
		
		}while(n!=0);
		
		media = somaN/cont;
		
		System.out.printf("A média dos números digitados e múltiplos de 3 é de: "+media);
			
	}

}
