package Lista3;

import java.util.Scanner;

public class L3Exercicio8 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int N;
		
		System.out.print("Digite um n�mero: ");
		N= ler.nextInt();
		
		if(N>100)
		{
			System.out.print("Seu n�mero �: "+N);
		}
		else //
		{
			System.out.print("0");
		}
	}
}
