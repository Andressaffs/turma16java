package Lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String args[])
	{
		try (Scanner ler = new Scanner(System.in))
		{
			int numero=0, maiorNumero = 0;
			
			for(int i=0; i<3; i++)
			{
			  System.out.printf("Digite um número: \n");
			  numero= ler.nextInt();		
			  
			  if(numero>maiorNumero)
			  {   
				  maiorNumero=numero;
			  }
			}
			  System.out.print("O maior número é "+maiorNumero);
		}
	}
}
