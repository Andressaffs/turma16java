package Lista1;

import java.util.Scanner;

public class L1Exercicio4 {

	public static void main (String args[])
	{
		try (Scanner ler = new Scanner(System.in)) {
			int A, B, C, D, R, S;
			
			System.out.println("Digite o valor de A: ");
			A= ler.nextInt();
			System.out.println("Digite o valor de B: ");
			B= ler.nextInt();
			System.out.println("Digite o valor de C: ");
			C= ler.nextInt();
			
		R= (int) Math.pow(A+B,2);		
		S= (int) Math.pow(B+C,2);
		D = R + S / 2;
		
		System.out.println("D é igual a : "+D);
		}			
	}

}
