package Lista5Vetores;

import java.util.Scanner;

public class L5Exercicio1 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int pontos[] = new int[5];
		int maiorPontuacao=0;
		
		for (int x=0; x<5; x++)
		{
			System.out.println("Pontuação da atividade: ");
			pontos[x] = leia.nextInt();
		}
		for(int x=0; x<5; x++)
		{
			System.out.printf("\nPosição "+x+": "+pontos[x]);
		     
		       if(pontos[x]>maiorPontuacao)
		       {
		     	maiorPontuacao=pontos[x];
		       }
		} 		
		System.out.printf("\nMaior pontuação: "+maiorPontuacao);
		
	}
}
