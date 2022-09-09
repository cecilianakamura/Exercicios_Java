package Lacos_repeticao;

import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args) {
/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:
o número de pessoas calmas;
o número de mulheres nervosas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.
 */
		final int pt=150;		//p numero total de pessoas
		int idade,genero,fp,contPC=0,contMN=0,contHA=0,contOC=0,contPN40=0,contPC18=0,p=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(p<=pt) {
			System.out.println("\nEntre com a sua idade:");
			idade = leia.nextInt();
			
			System.out.println("\nEntre com o gênero:\n1-Feminino\n2-Masculino\n3-Outros");
			genero = leia.nextInt();
			
			System.out.println("\nEntre com o fator psicologico:\n1-Calmo\n2-Nervoso\n3-Agressivo");
			fp = leia.nextInt();
			
			if(fp==1) {
				contPC++;
			}
			if (genero==1 && fp==2) {
				contMN++;
			}
			if(genero==2 && fp==3) {
				contHA++;
			}
			if(genero==3 && fp==1) {
				contOC++;
			}
			if(idade>40 && fp==3) {
				contPN40++;
			}
			if(idade<18 && fp==1) {
				contPC18++;
			}
			
			p++;
		}
		System.out.println("\na)O número de pessoas calmas é de: "+contPC);
		System.out.println("\nb)O número de mulheres nervosas é de: "+contMN);
		System.out.println("\nc)O número de homens agressivos é de: "+contHA);
		System.out.println("\nd)O número de pessoas não binárias e calmas é de: "+contOC);
		System.out.println("\ne)O número de pessoas nervosas com mais de 40 é de: "+contPN40);
		System.out.println("\nf)O número de pessoas calmas com menos de 18 anos é de: "+contPC18);
		
	}
}
