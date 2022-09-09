package Lacos_repeticao;

public class ex1_for {

	public static void main(String[] args) {
// Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
		
		final int divisor=11,ni=1000,nf=1999,resto=5;
		int n;
		System.out.println("Sequência de números entre "+ni+" e "+nf+" com resto "+resto+" quando divididos por "+divisor+":");
		
		for(n=ni;n<=nf;n++){

			if(n%divisor==resto) {
				
				System.out.println(n);
			}
			
		}

	}

}
