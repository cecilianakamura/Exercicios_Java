package Array;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		int[] vetor = new int[6];
		int x, somaPar = 0, contPar = 0, contImpar = 0;

		Scanner leia = new Scanner(System.in);


		for (x = 0; x < 6; x++) {
			System.out.println("Digite um número inteiro:");
			vetor[x] = leia.nextInt();
			if (vetor[x] % 2 == 0) {
				somaPar += vetor[x];
				contPar++;
			} else {
				contImpar++;
			}

		}
		
		System.out.println("a)Números pares digitados: ");
		for (x = 0; x < 6; x++) {
		if (vetor[x] % 2 == 0) {

			System.out.println(vetor[x] + " ");
		}

		}
		System.out.println("b)Soma dos números pares digitados: \n" + somaPar);
		System.out.println("c)Números ímpares digitados: ");
		for (x = 0; x < 6; x++) {

		if (vetor[x] % 2 != 0) {
			System.out.println(vetor[x] + " ");
		}

	
		}
		System.out.println("d)Quantidade de números ímpares digitados: \n" + contImpar);
	}

}
