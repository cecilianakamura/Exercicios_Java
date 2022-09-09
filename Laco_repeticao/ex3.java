package Lacos_repeticao;

import java.util.Scanner;

public class ex3 {
	
	public static void main (String[]arg){
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
*/
	int idade,menorIdade=0,maiorIdade=0;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite a idade:");
	idade = leia.nextInt();
	
	while(idade!=-99) {
		if(idade>=0 && idade<=21) {
			menorIdade++;
		}else if (idade>=50 && idade<=120) {
			maiorIdade++;
		}else {
			System.out.println("Idade inválida.");
		}
		System.out.println("Digite a idade:");
		idade = leia.nextInt();	
	}
	
	System.out.println("O total de pessoas com menos de 21 anos é de "+menorIdade+" e o total de pessoas com mais de 50 anos é de "+maiorIdade+".");
		
	}
}
