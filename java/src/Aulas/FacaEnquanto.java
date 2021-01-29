package Aulas;

import java.util.Scanner;

public class FacaEnquanto {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int numero=0, resultado=0;
		
		System.out.println("Digite um número: ");
		numero=ler.nextInt();
		do
		{
			resultado+= numero;
			numero--;
		}
		while (numero > 0);
				
		System.out.printf("A soma de todos os números é "+resultado+".");
	}
}
