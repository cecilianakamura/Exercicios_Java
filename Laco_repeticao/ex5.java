package Lacos_repeticao;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.
*/
	float n,soma=0;
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite um número:");
	n = leia.nextFloat();
	
	do {
		soma += n;
	System.out.println("Digite um número: ");
	n = leia.nextFloat();
	} while (n!=0);
	
	System.out.printf("A soma dos números digitados é de: %.2f",soma);
	}

}
