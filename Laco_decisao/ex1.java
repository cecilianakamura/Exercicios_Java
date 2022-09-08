package Lacos_decisao;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.

		int n1,n2,n3,maiorN=0;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número inteiro: ");
		n1 = leia.nextInt();
		if(n1>maiorN) {
			maiorN=n1;
		}
		
		System.out.println("Entre com o segundo número inteiro: ");
		n2 = leia.nextInt();
		if (n2>maiorN) {
			maiorN=n2;
		}
			
		System.out.println("Entre com o terceiro número inteiro: ");
		n3 = leia.nextInt();
		if (n3>maiorN) {
			maiorN=n3;
		}
			
		System.out.println("O maior número informado é: "+maiorN);
	}

}
