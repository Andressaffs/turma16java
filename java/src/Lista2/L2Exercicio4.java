package Lista2;

import java.util.Scanner;

public class L2Exercicio4 {
	public static void main (String args[])
	{
		try (Scanner ler = new Scanner(System.in))
		{
			int numero, raiz, quadrado;
			
			System.out.println("Digite um num positivo: ");
			numero= ler.nextInt();
			
			if( (numero%2) == 0)
			{
				raiz=(int) Math.sqrt(numero);
				System.out.println("O n�mero � par e sua raiz �: "+raiz);
			}
			else if( (numero%2) == 1)
			{
				quadrado=(int) Math.pow(numero,2);
				System.out.println("O n�mero � impar e seu quadrado �: "+quadrado);
			}
		}			
	}
}
