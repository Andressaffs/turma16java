package Lista1;

import java.util.Scanner;

public class Exercicio8 {
	public static void main (String args[])
	{
		try (Scanner ler = new Scanner(System.in)) {
			double custo, custoConsumidor;
			
			System.out.println("Insira o custo de fábrica: ");
			custo= ler.nextInt();
			
			custoConsumidor= (double) (custo + (custo * 0.28) + (custo * 0.45));	
		
		System.out.println("O custo para o consumidor é: "+ custoConsumidor);
		}
	}
}
