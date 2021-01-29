package Lista3;

import java.util.Scanner;

public class L3Exercicio1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		double P, M, E;
		
		System.out.println("Quantos quilos de tomate:");
		P=ler.nextDouble();
		
		E = P-50;
		M= E* 4.00;
		
		if (P>50)
		{
			System.out.println("Sua multa é de: "+M+" reais e seu excesso é de: "+E+ " quilos");
		}
		else if (P<50)
		{
			System.out.println("O valor é a ser pago é 0");
		}
		
		
	}

}
