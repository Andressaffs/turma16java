package Lista2;

import java.util.Scanner;

public class L2Exercicio3 {
	public static void main (String args[])
	{
		try (Scanner ler = new Scanner(System.in)) 
		{
			int idade;
			
			System.out.println("Informe a sua idade: ");
			idade= ler.nextInt();
			
			if(idade>=18 && idade<=25)
			{
				System.out.printf("Categoria 1- Você é considerado adulto.");
			}
			if (idade>=15 && idade<=17)
			{
				System.out.printf("Categoria 2- Você é considerado juvenil.");
			}
			if(idade>=10 && idade<=14)
			{
				System.out.printf("Categoria 3- Você é considerado infantojuvenil.");
			}
		}
	}
}
