package Array;

public class ex1 {

	public static void main(String[] args) {
		
		int[] A= {1,0,5,-2,-5,7};
		int[] B = new int[1];
		int x;
		
		System.out.println("a)Atribuindo os valores {1,0,5,-2,-5,7} à matriz A");
		B[0]=A[0]+A[1]+A[5];
		
		System.out.println("b)Somando os elementos A[0],A[1] e A[5], resultando na matriz B = "+B[0]);
		A[3]=100;
		System.out.println("c)Atribuindo o valor 100 à A[3]");
		System.out.println("d)Imprimindo os valores do vetor A:\n");
		for (x=0;x<6;x++) {
			System.out.println("A["+x+"]= "+A[x]);
			
		}
	}

}
