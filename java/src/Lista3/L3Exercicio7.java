package Lista3;

import java.util.Scanner;

public class L3Exercicio7 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		double base=0.00, altura=0.00, area=0.00;
		
		System.out.print("Digite a base do seu tri�ngulo: ");
		base= ler.nextDouble();
		System.out.print("Digite a altura do seu tri�ngulo: ");
		altura= ler.nextDouble();
		
		if(base>0 && altura>0)
		{
			area = (base*altura)/2;
			System.out.print("A �rea do tri�ngulo �: "+ Math.round(area));
		}
		else 
		{
			System.out.print("Voc� digitou um n�mero negativo ou zero. Valor n�o aceito");
		}	
		
	}

}
