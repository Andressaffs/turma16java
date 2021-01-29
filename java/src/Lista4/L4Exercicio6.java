package Lista4;

import java.util.Scanner;

public class L4Exercicio6 
{
 //Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
	public static void main (String args[])
	{
		Scanner ler= new Scanner(System.in);
		int numero=0;
		double media=0, contadorMultiplo=0, soma=0;
		
		do
		{
			System.out.print("Digite um número: ");
			numero=ler.nextInt();
			
			if (numero!=0)
			{
			   if((numero%3) ==0)
			  {
				contadorMultiplo++; 
				soma+= numero;
			  }
			  if(numero==0)
			  {
				System.out.print("Fim do programa");
			  }
		   }
	    }
		  while (numero!=0);
		
		media = soma/ contadorMultiplo;
		System.out.printf("A média dos números multiplos de 3 é "+media);
		
    }
}
