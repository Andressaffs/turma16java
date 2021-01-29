package Lista1;

import java.util.Scanner;

public class L1Exercicio1 {
	public static void main (String args[])
	{
		try (Scanner ler = new Scanner(System.in)) 
		{
			int idade, meses, dias, resultado;
			
			System.out.println("Digite a idade em anos: ");
			idade= ler.nextInt();
			System.out.println("Digite a idade em meses: ");
			meses= ler.nextInt();
			System.out.println("Digite a idade em dias: ");
			dias= ler.nextInt();
			resultado = ((idade*365)+(meses*30)+dias);
			
			System.out.println("Sua idade em dias é: ");	
			System.out.println(resultado);
		}
	}

}
