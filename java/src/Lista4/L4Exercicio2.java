package Lista4;

import java.util.Scanner;

public class L4Exercicio2 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int numero=0, impar=0, par=0;
		
		for (int i=1; i<=10; i++)
		{
			System.out.println("Insira o "+i+"° número: ");
			numero=ler.nextInt();
			
			if(numero%2==1)
			{
				impar++;	
			}
			if(numero%2==0)
			{
				par++;
			}		
		}
		
		    System.out.println("Tem "+par+" números pares e "+impar+" impares"); 
	}
}
