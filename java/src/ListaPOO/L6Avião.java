package ListaPOO;

import java.util.Scanner;

import entidades.Avi�o;
import entidades.Cliente;

public class L6Avi�o {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		Avi�o avi�o = new Avi�o();
		
		System.out.println("Digite o modelo do avi�o: ");
		avi�o.modeloAvi�o = leia.nextLine();
		System.out.println("Digite a companhia a�rea: ");
		avi�o.empresa=leia.nextLine();
		System.out.println("Digite o ano do avi�o: ");
		avi�o.ano = leia.nextInt();
		System.out.println("Qual a velocidade atual? ");
		avi�o.velocidadeAtual = leia.nextDouble();
		System.out.println("Qual a velocidade m�xima? ");
		avi�o.velocidadeMaxima = leia.nextDouble();
		
		
		System.out.printf("\nSeu modelo � %s do ano %d, pertence ao grupo %s.\n %s ",avi�o.modeloAvi�o,avi�o.ano,avi�o.empresa,avi�o.statusVelocidade());
		
		
		
		
	}
}
