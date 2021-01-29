package Lista3;

import java.util.Scanner;

public class L3Exercicio7 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		double base=0.00, altura=0.00, area=0.00;
		
		System.out.print("Digite a base do seu triângulo: ");
		base= ler.nextDouble();
		System.out.print("Digite a altura do seu triângulo: ");
		altura= ler.nextDouble();
		
		if(base>0 && altura>0)
		{
			area = (base*altura)/2;
			System.out.print("A área do triângulo é: "+ Math.round(area));
		}
		else 
		{
			System.out.print("Você digitou um número negativo ou zero. Valor não aceito");
		}	
		
	}

}
