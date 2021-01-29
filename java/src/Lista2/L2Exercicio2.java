package Lista2;

import java.util.Scanner;

public class L2Exercicio2 {
	public static void main (String args[])
	{   //Faça um programa que entre com três números e coloque em ordem crescente.
		try (Scanner ler = new Scanner (System.in)) 
		{
			int n1, n2, n3;
			
			  System.out.printf("Digite o primeiro número: \n");
			  n1= ler.nextInt();
			  System.out.printf("Digite o segundo número: \n");
			  n2= ler.nextInt();		  
			  System.out.printf("Digite o terceiro número: \n");
			  n3= ler.nextInt();	
			  
			  if(n1>n2 && n1>n3 && n2>n3)
			  {
				  System.out.printf("Ordem %d %d %d", n3, n2, n1);
			  }
			  else if(n1>n2 && n1>n3 && n3>n2)
			  {
				  System.out.printf("Ordem %d %d %d", n2, n3, n1);
			  }
			  else if(n1>n3 && n2>n1 && n1>n3)
			  {
				  System.out.printf("Ordem %d %d %d", n3, n1, n2);
			  }
			  else if(n2>n3 && n2>n1 && n3>n2)
			  {
				  System.out.printf("Ordem %d %d %d", n1, n3, n2);
			  }
			  else if(n3>n2 && n3>n1 && n2>n1)
			  {
				  System.out.printf("Ordem %d %d %d", n1, n2, n3);
			  }
			  else if(n3>n2 && n3>n1 && n1>n2)
			  {
				  System.out.printf("Ordem %d %d %d", n2, n1, n3);
			  }
		}
	}

}
