package Lista3;

import java.util.Scanner;

public class L3Exercicio4
{
	public static void main (String args[])
	{
		try (Scanner ler = new Scanner(System.in))
		{
			int numero;
			
			System.out.println("Digite um número inteiro: ");
			numero= ler.nextInt();
			
			if( (numero%2) == 0 && numero>0)
			{
				System.out.println("O número digitado é par e positivo");
			}
			else if( (numero%2) == 0 && numero<0)
			{
				System.out.println("O número digitado é par e negativo");
			}
			else if( (numero%2) == 1 && numero>0)
			{
				System.out.println("O número é impar e positivo");
			}
			else if( (numero%2) == 1 && numero<0)
			{
				System.out.println("O número digitado é impar e negativo"); //problema
			}
			else if (numero == 0)
			{
				System.out.println("Zero é neutro.");
			}
		}
	}

}
