package Lista3;

import java.util.Scanner;

public class L3Exercicio6 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.println("Informe sua idade: ");
		idade=ler.nextInt();
		
		if(idade>18)
		{
			System.out.println("Você é adulto");
		}
		
		else if(idade>=14 && idade<=17)
		{
			System.out.println("Você é juvenil B");
		}
		else if(idade>= 12 && idade<=13)
		{
			System.out.println("Você é juvenil A");
		}
		else if(idade>=8 && idade <=11)
		{
			System.out.println("Você é infantil B");
		}	
		else if (idade>=5 && idade<=7)
		{
			System.out.println("Você é infantil A");
		}
		else if(idade<=4)
		{
			System.out.println("Não podemos atender");
		}
	}

}
