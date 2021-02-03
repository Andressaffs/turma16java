package ListaPOO;

import java.util.Scanner;

import entidades.Avião;
import entidades.Cliente;

public class L6Avião {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		Avião avião = new Avião();
		
		System.out.println("Digite o modelo do avião: ");
		avião.modeloAvião = leia.nextLine();
		System.out.println("Digite a companhia aérea: ");
		avião.empresa=leia.nextLine();
		System.out.println("Digite o ano do avião: ");
		avião.ano = leia.nextInt();
		System.out.println("Qual a velocidade atual? ");
		avião.velocidadeAtual = leia.nextDouble();
		System.out.println("Qual a velocidade máxima? ");
		avião.velocidadeMaxima = leia.nextDouble();
		
		
		System.out.printf("\nSeu modelo é %s do ano %d, pertence ao grupo %s.\n %s ",avião.modeloAvião,avião.ano,avião.empresa,avião.statusVelocidade());
		
		
		
		
	}
}
