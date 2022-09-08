package Lacos_decisao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
*/
		int n;
		double resultado;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número:");
		n = leia.nextInt();
		
		if(n%2==0) {
			resultado=Math.sqrt(n);

		}else {
			resultado=Math.pow(n, 2);
		}
		
		System.out.printf("\nResultado: %.2f",resultado);
		
}
}
